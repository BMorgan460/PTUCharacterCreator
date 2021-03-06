package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Speed_Ace extends Feature {
	{
		name = "Speed Ace";
		tags = "[Class] [Branch]";
		frequency = "Static";
		effect = "Your Pokemon have their Speed increased by +1, and by +1 more for every 10 Levels they have (for example, a Level 20 Pokemon would have Speeds base value increased by +3). Additionally, your Pokemon may ignore Base Relations, as long as they are adding to Speed, and you do not need to ?correct? Stats due to this inflated Speed Value.  Note: You may take Stat Ace multiple times, choosing different Stats each time. If using Style Expert to qualify for Stat Ace, your Chosen Stat must be the Stat that correlates to your Chosen Contest Stat. Beauty is Special Attack, Cool is Attack, Cute is Speed, Smart is Special Defense, and Tough is Defense.  You may use the Stat in place of 'Stat' in all Stat Ace features on this sheet, e.g. 'Attack Ace' or 'Special Defense Link'.";
		prereqs.put("Ace Trainer or Style Expert", 0);
		prereqs.put("3 Pokemon with Speed of 15 or more Or 3 Pokemon with Speed as their Highest Stat and at 20 or higher", 0);
		prereqs.put("Command", 4);
		prereqs.put("Focus", 4);
	}
	public Speed_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",4) && t.checkSkillRank("Focus",4);
	}
}