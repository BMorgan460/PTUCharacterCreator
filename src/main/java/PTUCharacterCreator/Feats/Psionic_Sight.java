package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Psionic_Sight extends Feature {
	{
		name = "Psionic Sight";
		tags = "[+Special Defense]";
		frequency = "Static";
		effect = "You are able to visibly see any Psychic Residue left on Humans or Pokemon due to the effects of Psionic abilities. Each Human or Pokemon leaves distinct Psychic Residue on their targets, you are easily able to distinguish which targets have been affected by the same Psionic, though to identify that Psionic you need to have a way of knowing their signature (such as simply seeing them do it, and seeing the resulting signature).";
		prereqs.put("Elemental Connection (Psychic)", 0);
	}
	public Psionic_Sight(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Elemental Connection (Psychic)");
	}
}