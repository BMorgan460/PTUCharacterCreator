package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dazzling_Dervish extends Feature {
	{
		name = "Dazzling Dervish";
		tags = "[Orders]";
		frequency = "Scene x2 - Standard Action";
		effect = "Target: Your Pokemon Effect: Until the end of their next turn, the target adds their non-stat Evasion to their Movement Capabilities and whenever they attack a foe or Shift through a square occupied by a foe, that foe suffers a -3 penalty to all rolls until the end of their next turn. This effect may only affect a foe once per round.";
		prereqs.put("Trickster Orders", -1);
	}
	public Dazzling_Dervish(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Trickster Orders");
	}
}