package com.study_geberics.exp5;
//Использование нескольких универсальных параметров
public class Account4 <T,S> {
    private T id;
    private S sum;

    public Account4(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }
    public T getId() {
        return id;
    }
    public S getSum() {
        return sum;
    }
    public void setSum(S sum) {
        this.sum = sum;
    }
}
