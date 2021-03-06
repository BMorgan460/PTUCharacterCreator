package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Stat_Ace extends Feature {
	{
		name = "Stat Ace";
		tags = "[Class] [Branch]";
		frequency = "Static";
		effect = "Your Pokemon have their Chosen Base Stat increased by +1, and by +1 more for every 10 Levels they have (for example, a Level 20 Pokemon would have your Chosen Stats base value increased by +3). Additionally, your Pokemon may ignore Base Relations, as long as they are adding to the Stat chosen for Stat Ace, and you do not need to ?correct? Stats due to this inflated Stat Value.  Note: When you take Stat Ace, choose Attack, Defense, Special Attack, Special Defense, or Speed. This becomes your Pokemons Chosen Stat. You may take Stat Ace multiple times, choosing different Stats each time. If using Style Expert to qualify for Stat Ace, your Chosen Stat must be the Stat that correlates to your Chosen Contest Stat. Beauty is Special Attack, Cool is Attack, Cute is Speed, Smart is Special Defense, and Tough is Defense.  You may use the Stat in place of 'Stat' in all Stat Ace features on this sheet, e.g. 'Attack Ace' or 'Special Defense Link'.";
		prereqs.put("Ace Trainer or Style Expert", 0);
		prereqs.put("3 Pokemon with the chosen stat of 15 or more Or 3 Pokemon with the chosen stat as their Highest Stat and at 20 or higher", 0);
		prereqs.put("Command", 4);
		prereqs.put("Focus", 4);
	}
	public Stat_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",4) && t.checkSkillRank("Focus",4);
	}
}