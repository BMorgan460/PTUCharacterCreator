package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Provocateur extends Feature {
	{
		name = "Provocateur";
		tags = "[Class][+Speed]";
		frequency = "";
		effect = "Static Effect: You learn the Moves Sweet Kiss and Taunt. Note: Provocateur Skills are Charm, Guile, and Intimidate.";
		prereqs.put("Intimidating Presence, Charmer, or Confidence Artist", -3);
	}
	public Provocateur(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Intimidating Presence") || t.hasEdge("Confidence Artist") || t.hasEdge("Charmer");
	}
}