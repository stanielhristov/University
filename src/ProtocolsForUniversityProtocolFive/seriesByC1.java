package ProtocolsForUniversityProtocolFive;

public class seriesByC1 implements Series {
    private long start;
    private long nextNumber;


    @Override
    public long getNext() {
        nextNumber = (long) Math.pow(nextNumber, 3);
        return nextNumber;
    }

    @Override
    public void reset() {
        this.start = 0;
        this.nextNumber = 0;
    }

    @Override
    public void setStart(int x) {
        this.start = x;
        this.nextNumber = x;
    }

}

