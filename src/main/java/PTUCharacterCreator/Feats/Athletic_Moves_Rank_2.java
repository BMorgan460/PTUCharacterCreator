package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Athletic_Moves_Rank_2 extends Feature {
	{
		name = "Athletic Moves Rank 2";
		tags = "[+HP] [Ranked 3]";
		frequency = "Static";
		effect = "You learn two Athlete Moves marked Rank 2 or lower. Rank 2: Body Slam, Take Down, Extreme Speed";
		prereqs.put("Athlete", -1);
		prereqs.put("Athletics", 5);
	}
	public Athletic_Moves_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Athlete") && t.checkSkillRank("Athletics",5);
	}
}