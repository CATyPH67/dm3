package com.company;

public class ResultSort {
    private int[] arr;
    private int countComparison ;
    private int countPermutation;

    public ResultSort(int[] arr, int countComparison, int countPermutation) {
        this.arr = arr;
        this.countComparison = countComparison;
        this.countPermutation = countPermutation;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getCountComparison() {
        return countComparison;
    }

    public void setCountComparison(int countComparison) {
        this.countComparison = countComparison;
    }

    public int getCountPermutation() {
        return countPermutation;
    }

    public void setCountPermutation(int countPermutation) {
        this.countPermutation = countPermutation;
    }
}
