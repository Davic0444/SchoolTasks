package kiralynok;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Kiralynok {

    public static class Table{

        private char T[][] = new char[8][8];
        private char emptyCell = '#';

        public Table(char ec){
            this.emptyCell = ec;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    T[i][j] = emptyCell;
                }
            }
        }

        public void show(){
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(T[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
        }

        public void place(int n){
            for (int i = 0; i < n; i++) {
                int x;
                int y;
                do {
                    x = (int) (Math.random()*8);
                    y = (int) (Math.random()*8);
                } while (T[x][y] !=  emptyCell);
                T[x][y] = 'K';
            }
        }

        public boolean emptyColumn(int m){
            int i = 0;
            while (i <= 7 && T[i][m] == emptyCell){
                i++;
            }
            return !(i <= 7);
        }

        public boolean emptyRow(int m){
            int i = 0;
            while (i <= 7 && T[m][i] == emptyCell){
                i++;
            }
            return !(i <= 7);
        }

        public int emptyColumnNumber(){
            int piece = 0;
            for (int i = 0; i < 8; i++) {
                if (emptyColumn(i)){
                    piece++;
                }
            }
            return piece;
        }

        public int emptyRowNumber(){
            int piece = 0;
            for (int i = 0; i < 8; i++) {
                if (emptyRow(i)){
                    piece++;
                }
            }
            return piece;
        }

        public void fileWrite() throws IOException{
            try (PrintWriter pw = new PrintWriter(new FileWriter("tablak64.txt"))) {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        pw.print(T[i][j]);
                    }
                    pw.println("");
                }
                pw.println('\n');
            }
        }

        public static void main(String[] args) throws IOException {
            Table table = new Table('#');
            System.out.println("4. feladat: az üres tábla");
            table.show();

            System.out.println("6. feladat: A feltöltött tábla");
            table.place(8);
            table.show();

            System.out.println("9. feladat: Üres sorok és oszlopok száma");
            System.out.println("Oszlopok: "+ table.emptyColumnNumber());
            System.out.println("Sorok: "+ table.emptyRowNumber());

            for (int i = 1; i < 65; i++) {
                Table tableObj = new Table('*');
                tableObj.place(i);
                tableObj.fileWrite();
            }

        }
    }
}
