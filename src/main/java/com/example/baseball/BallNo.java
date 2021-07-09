package com.example.baseball;

import java.util.Objects;

public class BallNo {
    private int no;
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;

    public BallNo(int no) {
        validate(no);
        this.no = no;
    }

    private void validate(int no) {
        if(no > MAX_NO || no < MIN_NO) {
            throw new IllegalArgumentException("번호는 1~9까지입니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallNo ballNo = (BallNo) o;
        return no == ballNo.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }
}
