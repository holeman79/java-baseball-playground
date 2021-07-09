package com.example.baseball;

import java.util.Objects;

public class BallPosition {
    private int position;
    public static int MAX_POSITION = 3;
    public static int MIN_POSITION = 1;

    public BallPosition(int position) {
        validate(position);
        this.position = position;
    }

    private void validate(int position) {
        if(position < MIN_POSITION || position > MAX_POSITION) {
            throw new IllegalArgumentException("Position 값은 1~3 사이입니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallPosition that = (BallPosition) o;
        return position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
