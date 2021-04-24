package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Martial_Achievement extends Feature {
	{
		name = "Martial Achievement";
		tags = "[Special]";
		frequency = "Static";
		effect = "You gain a Martial Achievement based on your chosen Ability. »» Guts: Wrestlemania »» Inner Focus: Heightened Intensity »» Iron Fist: Pummeling Momentum »» Limber: Bend Like the Willow »» Reckless: Soft Landing »» Technician: Whirlwind Strikes";
		prereqs.put("Martial Artist", -1);
	}
	public Martial_Achievement(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Martial Artist");
	}
}