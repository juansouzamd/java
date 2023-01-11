class Carro {

   String cor;
   String modelo;
   int capacidaDeTanque;

   // Construtor

   Carro() {
   }

   Carro(String cor, String modelo, int capacidaDeTanque) {
      this.cor = cor;
      this.modelo = modelo;
      this.capacidaDeTanque = capacidaDeTanque;
   }

   // Get Set

   void setCor(String cor) {
      this.cor = cor;
   }

   String getCor() {
      return cor;
   }

   void setModelo(String modelo) {
      this.modelo = modelo;
   }

   String getModelo() {
      return modelo;
   }

   void setcapacidaDeTanque(int capacidaDeTanque) {
      this.capacidaDeTanque = capacidaDeTanque;
   }

   int getCapacidadeTanque() {
      return capacidaDeTanque;
   }

   // Método

   double valorTotalTanque(double valorCombustivel) {
      return capacidaDeTanque * valorCombustivel;
   }

}
