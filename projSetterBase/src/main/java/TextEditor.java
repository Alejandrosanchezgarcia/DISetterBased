public class TextEditor {
   private SpellChecker spellChecker;
   // un metodo de setter para la inyeccion de dependecia.
   public void setSpellChecker(SpellChecker spellChecker) {
      System.out.println("Conjunto del set SpellChecker." );
      this.spellChecker = spellChecker;
   }
   // el metodo getter para que nos devuelva spellChecker.
   public SpellChecker getSpellChecker() {
      return spellChecker;
  }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }
}