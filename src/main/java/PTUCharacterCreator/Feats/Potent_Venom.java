package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Potent_Venom extends Feature {
	{
		name = "Potent Venom";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Trigger: Your Poison-Type Pokemon inflicts Poison on a foe Effect: The foe does not necessarily lose Special Defense Combat Stages from Poison, instead, they lose Combat Stages in the Combat Stat of your choice. Whenever the target loses Hit Points from Poison, they lose additional Hit Points equal to your Type-Linked Skill Rank.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Poison as Chosen Type", 0);
	}
	public Potent_Venom(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}