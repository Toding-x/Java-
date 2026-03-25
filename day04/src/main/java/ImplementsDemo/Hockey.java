package ImplementsDemo;

public interface Hockey extends Sports,Football{
     void homeGoalScored();
     void visitingGoalScored();
     void endOfPeriod(int period);
     void overtimePeriod(int ot);
}
