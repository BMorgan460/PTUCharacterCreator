package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Athletic_Moves_Rank_3 extends Feature {
	{
		name = "Athletic Moves Rank 3";
		tags = "[+HP] [Ranked 3]";
		frequency = "Static";
		effect = "You learn two Athlete Moves marked Rank 3 or lower. Rank 3: Mega Kick, Facade, Retaliate";
		prereqs.put("Athlete", -1);
		prereqs.put("Athletics", 6);
	}
	public Athletic_Moves_Rank_3(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Athlete") && t.checkSkillRank("Athletics",6);
	}
}