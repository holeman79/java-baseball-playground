package com.example.baseball;

import java.util.Objects;

public class Ball {
    private int no;
    private int position;

    public Ball(int no, int position) {
        this.no = no;
        this.position = position;
    }

    public BallStatus play(Ball other) {
        if(this.equals(other)) {
            return BallStatus.STRIKE;
        }
        if(matchBallNo(other.no)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchBallNo(int no) {
        return Objects.equals(this.no, no);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return no == ball.no && position == ball.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, position);
    }
}
