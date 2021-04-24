package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Unveiled_Sight extends Feature {
	{
		name = "Unveiled Sight";
		tags = "[+Special Defense]";
		frequency = "Static";
		effect = "You can see through Illusions. This means you can spot Illusions from the Illusionist capability, Illusion Ability, and Genjutsu Feature as being fake. You are immune to Moves with the Illusion keyword, Double Team cannot be activated against you, and you bypass Substitutes. As a Standard Action, you can create a Burst 4, dispelling all Illusion effects within.";
		prereqs.put("Oracle", -1);
	}
	public Unveiled_Sight(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Oracle");
	}
}