package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Poke_Ball_Mods extends Feature {
	{
		name = "Poke Ball Mods";
		tags = "[Jailbreaker Research Field]";
		frequency = "Static";
		effect = "You may craft any of the following Poke Ball Modifications: Habitat, Power, Type, Fabulous, Learning, Weather";
		prereqs.put("Jailbreaker", -1);
	}
	public Poke_Ball_Mods(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Jailbreaker");
	}
}