public class TestAnnotation {
   private String nom = "toto";
   
   /**
    * Commentaire Javadoc de la m�thode, juste pour l'exemple
    * @return
    */
   @AnnotationZ 
   public String faisQuelqueChose(){
      return "Je ne fais rien...";
   }
   
   /**
    * Un autre commentaire JavaDoc
    * @return
    */
   @Temoin
   public String faisQuelqueChoseDAutre(){
      return "Je ne fais rien...";
   }
}