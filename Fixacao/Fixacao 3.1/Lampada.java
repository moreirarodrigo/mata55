public class Lampada {
  private int potencia;
  private boolean led;
  private boolean ligada;

  public Lampada() {
    this.ligada = true;
    this.led = true;
    this.potencia = 60;
  }

  public Lampada(boolean estado, boolean led, int potencia) {
    this.ligada = estado;
    this.led = led;
    this.potencia = potencia;
  }

  public void getLampada() {
    System.out.println("Potencia: "+this.potencia+
                       "\nLigada: "+this.ligada+
                       "\nLed: "+this.led);
  }
}
