package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sages_Benediction extends Feature {
	{
		name = "Sage's Benediction";
		tags = "[+HP]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: An ally activates one of your Moves with the Blessing Keyword. Effect: The triggering ally gains an additional benefit as follows, depending on the Move used. The benefit takes effect after the Blessing and the attack that triggered it are resolved. »» Reflect: +1 Defense Combat Stage »» Light Screen: +1 Sp. Defense Combat Stage »» Safeguard: +1 Evasion »» Lucky Chant: +1 Accuracy";
		prereqs.put("Sacred Shield or Mystic Defense", 0);
		prereqs.put("Ocu Edu", 4);
	}
	public Sages_Benediction(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",4);
	}
}