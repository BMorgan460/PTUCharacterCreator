package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Power_of_the_Mind extends Feature {
	{
		name = "Power of the Mind";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "Choose Interference or Levitate. You gain the chosen Ability.";
		prereqs.put("Telekinetic", -1);
	}
	public Power_of_the_Mind(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Telekinetic");
	}
}