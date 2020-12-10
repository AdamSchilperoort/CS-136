
/**
 * extends Amplifier, methods calculate gain for a noninverting amplifier
 * @author Adam Schilperoort, Jakub Wdowski
 * @since May 4, 2018
 */
public class NoninvertingAmplifier extends Amplifier{
  double r1;
  double r2;

  /**
   * NoninvertingAmplifier Constructor, sets r1 and r2 locally
   * @param r1 resistance of resistor 1 passed to constructor to set local var r1
   * @param r2 resistance of resistor 1 passed to constructor to set local var r1
   */
  public NoninvertingAmplifier(double r1, double r2){
    this.r1=r1;
    this.r2=r2;
  }

  /**
   * [getGain description]
   * @return [description]
   */
  public double getGain(){
    return (1 + r2/r1);
  }

  /**
   * getDescription prints text along with values for r1 and r2
   * @return returns print statement and value of r1 and r2
   */
  public String getDescription(){
    return "Noninverting Amplifier: R1= " +r1+ " R2= " +r2;
  }
}
