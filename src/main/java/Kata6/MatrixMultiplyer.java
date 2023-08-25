package Kata6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixMultiplyer {
    public static void main(String[] args) {
        getMatrixProduct(new double[][] { { 1, 2 }, { 3, 4 } }, new double[][] { { 5, 6 }, { 7, 8 } });
    }


        public static double[][] getMatrixProduct(double[][] a, double[][] b) {
            if(a[0].length != b.length) return null;
            if(a[0].length != b.length) return null;
            List<List<Double>> productList = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                List<Double> row = new ArrayList<>();
                for (int j = 0; j < b[0].length; j++) {
                    double sum = 0;
                    for (int k = 0; k < a[i].length; k++) {
                        sum += a[i][k] * b[k][j];
                    }
                    row.add(sum);
                    System.out.println(row);
                }
                productList.add(row);
            }

            double[][] result = new double[productList.size()][productList.get(0).size()];
            for (int i = 0; i < productList.size(); i++) {
                for (int j = 0; j < productList.get(i).size() ; j++) {
                    result[i][j] = productList.get(i).get(j);
                }
            }
            return result;
        }


    }








