package ladder.domain.line;

import ladder.domain.Point;

public class ManualLineTruePoint implements LineStrategy {

    @Override
    public Point makePoint(Point prevPoint, int lastValue) {
        return truePoint();
    }

    public Point truePoint() {
        return new Point(true, true);
    }
}
