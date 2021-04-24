package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dress_to_Impress extends Feature {
	{
		name = "Dress to Impress";
		tags = "";
		frequency = "Scene x2 - Standard Action";
		effect = "Target: Your Chic Pokemon Effect: Your Pokemon gains the effect of all items in extra slots granted by Versatile Wardrobe for one full round. Dress to Impress may only target a Pokemon once per Scene.";
		prereqs.put("Versatile Wardrobe", -1);
		prereqs.put("two Fashionista Skills at Expert", 0);
	}
	public Dress_to_Impress(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Command", "Guile", "Intimidate", "Intuition"};
		return t.hasFeat("Versatile Wardrobe") && checkMultipleSkills(t,s,5,2);
	}
}