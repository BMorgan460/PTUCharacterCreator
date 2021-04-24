package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Earthroil extends Feature {
	{
		name = "Earthroil";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Your Ground-Type Pokemon may activate Earthroil as a Shift Action to use a damaging Ground-Type Move as it had a range of Line 4 or Burst 1 instead of its usual range, and as if it had the Groundsource keyword. 1-Target Moves performed this way take a -5 penalty to their Damage Rolls.";
		prereqs.put("Mold the Earth", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Earthroil(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Mold the Earth");
	}
}