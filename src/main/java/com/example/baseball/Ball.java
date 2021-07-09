package com.example.baseball;

import java.util.Objects;

public class Ball {
    private BallNo ballNo;
    private BallPosition ballPosition;

    public Ball(int no, int position) {
        this.ballNo = new BallNo(no);
        this.ballPosition = new BallPosition(position);
    }

    public BallStatus play(Ball other) {
        if(this.equals(other)) {
            return BallStatus.STRIKE;
        }
        if(matchBallNo(other.ballNo)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchBallNo(BallNo ballNo) {
        return Objects.equals(this.ballNo, ballNo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Objects.equals(ballPosition, ball.ballPosition) && Objects.equals(ballNo, ball.ballNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNo, ballPosition);
    }
}
