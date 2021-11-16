package com.company;

public class ResultSort {
    private int[] arr;
    private int count;

    public ResultSort(int[] arr, int count) {
        this.arr = arr;
        this.count = count;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
