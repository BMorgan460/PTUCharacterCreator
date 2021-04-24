package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Aura_Guardian extends Feature {
	{
		name = "Aura Guardian";
		tags = "Class] [+Attack or Special Attack]";
		frequency = "Static";
		effect = "Choose two of Detect, Vacuum Wave, or Force Palm. You learn the chosen Moves.";
		prereqs.put("Elemental Connection (Fighting)", 0);
	}
	public Aura_Guardian(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Elemental Connection (Fighting)");
	}
}