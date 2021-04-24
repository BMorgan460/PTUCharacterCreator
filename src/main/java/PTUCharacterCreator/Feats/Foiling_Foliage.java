package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Foiling_Foliage extends Feature {
	{
		name = "Foiling Foliage";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with a Grass-Type Status Move Effect: Pick a Grass-Type Status-Class Move known by the target. The chosen Move no longer takes up a Move Slot. A Pokemon may have only one Move bypass the Move Limit at a time, if a new Move is chosen for a Pokemon, the previous Move loses this effect.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Grass as Chosen Type", 0);
	}
	public Foiling_Foliage(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}