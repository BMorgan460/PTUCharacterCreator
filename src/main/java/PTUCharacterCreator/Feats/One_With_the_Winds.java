package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class One_With_the_Winds extends Feature {
	{
		name = "One With the Winds";
		tags = "[+Speed]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Effect: You summon a windy breeze that follows you around. Your sense of touch is extended through this wind, and you can guide it by thought, using it to perceive the shape and texture of objects as long as the wind can reach, even through very small cracks and holes. The range of this effect is equal to your Acrobatics Rank plus Perception Rank in meters.";
		prereqs.put("Perception", 4);
	}
	public One_With_the_Winds(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Perception",4);
	}
}