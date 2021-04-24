package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Hydro_Jet extends Feature {
	{
		name = "Hydro Jet";
		tags = "[+Speed]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You use a damaging single target Water-Type Move Effect: Hydro Jets effect depends on if the triggering Move was Melee or Ranged.  »» If Melee, the Move gains the Pass keyword and you may change direction during the four meters of Pass (but may still only target any given Pokemon or Trainer once). »» If Ranged, the Move becomes a Line 4 instead of its usual range.";
		prereqs.put("Call the Current Rank 1", -1);
	}
	public Hydro_Jet(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Call the Current Rank 1");
	}
}