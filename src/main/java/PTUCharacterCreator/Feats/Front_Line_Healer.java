package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Front_Line_Healer extends Feature {
	{
		name = "Front Line Healer";
		tags = "[9-15 Playtest]";
		frequency = "Static";
		effect = "When you apply a Restorative, you gain +5 Damage Reduction for 1 full round. Whenever you use Combat Medics Primers Rank 2 effect, you may apply the same effect on yourself. Damage Reduction from this Feature does not stack with itself.";
		prereqs.put("Medic", -1);
	}
	public Front_Line_Healer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Medic");
	}
}