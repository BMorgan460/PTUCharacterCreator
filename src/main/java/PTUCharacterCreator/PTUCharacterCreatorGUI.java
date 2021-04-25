/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PTUCharacterCreator;

import PTUCharacterCreator.Feats.*;
import PTUCharacterCreator.Edges.*;
import PTUCharacterCreator.Abilities.*;
import java.awt.GraphicsEnvironment;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author alask
 */
public class PTUCharacterCreatorGUI extends javax.swing.JFrame {
    
    private Trainer t;
    private String[] classes = {"Ace_Trainer","Capture_Specialist","Commander","Coordinator","Hobbyist","Mentor","Cheerleader","Duelist","Enduring_Soul","Juggler","Rider","Taskmaster","Trickster","Stat_Ace","Attack_Ace","Defense_Ace","Special_Attack_Ace","Special_Defense_Ace","Speed_Ace","Style_Expert","Type_Ace","Chef","Chronicler","Fashionista","Researcher","Survivalist","Athlete","Dancer","Hunter","Martial_Artist","Musician","Provocateur","Rogue","Roughneck","Tumbler","Channeler","Hex_Maniac","Ninja","Oracle","Sage","Telekinetic","Telepath","Warper","Glitch_Bender","Berserker","Rune_Master","Arcanist","Fortress","Marksman","Skirmisher","Swarmlord","Shade_Caller","Herald_of_Pride","Spark_Master","Glamour_Weaver","Fire_Bringer","Wind_Runner","Apparition","Druid","Earth_Shaker","Frost_Touched","Prism","Miasmic","Stone_Warrior","Steelheart","Maelstrom","Backpacker","Cheerleader_Playtest","Medic",};
    private String[] feats = {"Perseverance","Elite_Trainer","Critical_Moment","Top_Percentage","Signature_Technique","Champ_in_the_Making","Advanced_Capture_Techniques_Rank_1","Advanced_Capture_Techniques_Rank_2","Advanced_Capture_Techniques_Rank_3","Advanced_Capture_Techniques_Rank_4","Captured_Momentum","Gotta_Catch_Em_All","Mobilize","Leadership","Battle_Conductor","Complex_Orders","Tip_the_Scales","Scheme_Twist","Decisive_Director","Adaptable_Performance","Flexible_Preparations","Innovation","Nuanced_Performance","Reliable_Performance","Dilettante_Rank_1","Dilettante_Rank_2","Dilettante_Rank_3","Dilettante_Rank_4","Dabbler","Look_and_Learn","Lessons","Expand_Horizons","Guidance","Move_Tutor","Egg_Tutor","Lifelong_Learning","Cheer_Brigade","Gleeful_Interference","Inspirational_Support","Moment_of_Action","Go_Fight_Win","Keep_Fighting","Expend_Momentum","Effective_Methods","Directed_Focus","Type_Methodology","Duelists_Manual","Seize_The_Moment","Staying_Power","Shrug_Off","Awareness","Resilience","Not_Yet","Vim_and_Vigor","Bounce_Shot","Juggling_Show","Round_Trip","Tag_In","Emergency_Release","First_Blood","Ride_as_One","Conquerors_March","Ramming_Speed","Lean_In","Cavaliers_Reprisal","Overrun","Quick_Healing","Savage_Strike","Strike_of_the_Whip","Pain_Resistance","Press_On","Desperate_Strike","Deadly_Gambit","Bag_of_Tricks_Rank_1","Bag_of_Tricks_Rank_2","Stacked_Deck","Flourish","Encore_Performance","Sleight","Stat_Link","Attack_Link","Defense_Link","Special_Attack_Link","Special_Defense_Link","Speed_Link","Stat_Training","Attack_Training","Defense_Training","Special_Attack_Training","Special_Defense_Training","Speed_Training","Stat_Stratagem","Attack_Stratagem","Defense_Stratagem","Special_Attack_Stratagem","Special_Defense_Stratagem","Speed_Stratagem","Stat_Maneuver","Attack_Maneuver","Defense_Maneuver","Special_Attack_Maneuver","Special_Defense_Maneuver","Speed_Maneuver","Stat_Mastery","Attack_Mastery","Defense_Mastery","Special_Attack_Mastery","Special_Defense_Mastery","Speed_Mastery","Stat_Embodiment","Attack_Embodiment","Defense_Embodiment","Special_Attack_Embodiment","Special_Defense_Embodiment","Speed_Embodiment","Style_Flourish","Style_Entrainment","Beautiful_Ballet_Rank_1","Beautiful_Ballet_Rank_2","Fabulous_Max","Enticing_Beauty","Cool_Conduct_Rank_1","Cool_Conduct_Rank_2","Rule_of_Cool","Action_Hero_Stunt","Cute_Cuddle_Rank_1","Cute_Cuddle_Rank_2","Gleeful_Steps","Lets_Be_Friends","Smart_Scheme_Rank_1","Smart_Scheme_Rank_2","Calculated_Assault","Learn_From_Your_Mistakes","Tough_Tumble_Rank_1","Tough_Tumble_Tank_2","Macho_Charge","Endurance","Type_Refresh","Move_Sync","Insectoid_Utility","Iterative_Evolution","Chitin_Shield","Disruption_Order","Sneak_Attack","Clever_Ruse","Devious","BlackOut_Strike","Highlander","Unconquerable","Tyrants_Roar","This_Will_Not_Stand","Lockdown","Chain_Lightning","Shocking_Speed","Overload","Arcane_Favor","Fey_Trance","Fairy_Lights","Fairy_Rite","Close_Quarters_Mastery","Brawler","Face_Me_Whelp","Smashing_Punishment","Brightest_Flame","Trail_Blazer","Incandescence","Fan_The_Flames","Celerity","Gale_Strike","Zephyr_Shield","Tornado_Charge","Ghost_Step","Haunting_Curse","Vampirism","Boo","Foiling_Foliage","Sunlight_Within","Enduring_Bloom","CrossPollinate","Mold_the_Earth","Desert_Heart","Earthroil","Upheaval","Glacial_Ice","Polar_Vortex","Arctic_Zeal","Deep_Cold","Extra_Ordinary","Plainly_Perfect","New_Normal","Simple_Improvements","Potent_Venom","Debilitate","Corrosive_Blight","Miasma","Psionic_Sponge","Mindbreak","Psychic_Resonance","Force_of_Will","Gravel_Before_Me","Bigger_and_Boulder","Tough_as_Schist","Gneiss_Aim","Polished_Shine","Iron_Grit","Assault_Armor","True_Steel","Flood","Fishbowl_Technique","Fountain_of_Life","Aqua_Vortex","Hits_the_Spot","Culinary_Appreciation","Accentuated_Taste","Complex_Aftertaste","Dietician","Dumplings","Archival_Training_Rank_1","Archival_Training_Rank_2","Archive_Tutor","Targeted_Profiling","Observation_Party","Cinematic_Analysis","Dashing_Makeover","Style_is_Eternal","Accessorize","Parfumier","Versatile_Wardrobe","Dress_to_Impress","Breadth_of_Knowledge","Live_and_Learn","Instant_Analysis","Echoes_of_the_Future","Apothecary","Patch_Cure","Medical_Techniques","Medicinal_Blend","Crystal_Artificer","Crystal_Resonance","Rainbow_Light","Fistful_of_Force","Seed_Bag_Rank_1","Seed_Bag_Rank_2","Top_Tier_Berries","Herb_Lore","Chemist","Chemical_Warfare","Caustic_Chemistry","Playing_God","Climatology","Climate_Control","Weather_Systems","Extreme_Weather","Witch_Hunter","Psionic_Analysis","Mental_Resistance","Immutable_Mind","Fossil_Restoration","Ancient_Heritage","Genetic_Memory","Prehistoric_Bond","Pusher","This_Ones_Special_I_Know_It","Skill_Trainer","ReBalancing","Natural_Fighter","Trapper","Wilderness_Guide","Terrain_Talent_Rank_1","Terrain_Talent_Rank_2","Adaptive_Geography","Training_Regime","Coaching","Adrenaline_Rush","Athletic_Moves_Rank_1","Athletic_Moves_Rank_2","Athletic_Moves_Rank_3","Dance_Form","Beguiling_Dance","Dance_Practice","Choreographer","Power_Pirouette","Passing_Waltz","Pack_Tactics","Surprise","Hunters_Reflexes","Finisher","Dont_Look_Away","Pack_Master","Martial_Training_Rank_1","Martial_Training_Rank_2","Martial_Training_Rank_3","My_KungFu_is_Stronger","Martial_Achievement","Second_Strike","Musical_Ability","Mt_Moon_Blues","Cacophony","Noise_Complaint","Voice_Lessons","Power_Chord","Push_Buttons","Quick_Wit","Mixed_Messages","Powerful_Motivator","Play_Them_Like_a_Fiddle","Enchanting_Gaze","Cutthroat","Dirty_Fighting","Unexpected_Attacks","Underhanded_Tactics","Street_Fighter","Scoundrels_Strike","Menace","Mettle","Malice","Fearsome_Display","Cruel_Gaze","Tough_as_Nails","Aerialist","Quick_Gymnastics","Flip_Out","Death_From_Above","Quick_Reflexes","Burst_of_Speed","Aura_Guardian","Aura_Reader","The_Power_of_Aura_Rank_1","The_Power_of_Aura_Rank_2","Sword_of_Body_and_Soul","Ambient_Aura","Aura_Mastery","Shared_Senses","Battle_Synchronization","Spirit_Boost","Power_Conduit","Pain_Dampening","Soothing_Connection","Hex_Maniac_Studies_Rank_1","Hex_Maniac_Studies_Rank_2","Hex_Maniac_Studies_Rank_3","Diffuse_Pain","Malediction","Grand_Hex","Ninjas_Arsenal","Poison_Weapon","Genjutsu","Utility_Drop","Weightless_Step","Kinjutsu","Divination","Unveiled_Sight","Small_Prophecies","Mark_of_Vision","TwoSecond_Preview","Prescience","Sacred_Shield","Mystic_Defense","Sages_Benediction","Lay_on_Hands","Highly_Responsive_to_Prayers","Divine_Wind","PK_Alpha","PK_Omega","Power_of_the_Mind","PK_Combat","Telekinetic_Burst","Psionic_Overload","Honed_Mind","Telepathic_Awareness","Thought_Detection","Telepathic_Warning","Mental_Assault","Suggestion","Space_Distortion","Warping_Ground","Strange_Energy","Farcast","Warped_Transmission","Reality_Bender","Engineer","Robofighter","Overclock","Experimental_AI","Jailbreaker","Poke_Ball_Mods","Poke_Ball_Mods","Fusion_Cases","Case_Specialist","Upgrader","Emergency_Reactivation","Efficient_Installation","Experimental_Designs","I_Am_Error","Corrupt_Reality","Code_Injection","Null_Error","Glitch_Shuffle","Glitch_Burst","Power_of_Rage","Lessons_In_Rage__Pain","Frenzy","Fight_On_and_On","Crash_and_Smash","Push_it_to_the_Limit","Hidden_Power","Rewrite","Words_of_Power","Glyph","Alarm_Runes","Explosive_Runes","Sentry_Runes","Metamagic","Authentic_Thaumaturgy","Signature_Manipulations_Rank_1","Signature_Manipulations_Rank_2","Recoup_Energy","Soul_Investment","Slow_or_Steady","Stalwart_Bastion","Shield_Bearer","Wall_of_Iron","Guardians_Punishment","Unstoppable_Will","Aiming_Down_The_Sights","Double_Shot","Overwatch","Clear_Shot","Crippling_Shot","DeadEye_Shot","Nimble_Steps","Counter_Stance","Harrier","Weapon_Finesse","Outmaneuver","Swift_Strikes","How_To_Shoot_Web","Broodlord","Pheromone_Markers","Enhanced_Embrace_Rank_1","Enhanced_Embrace_Rank_2","Enhanced_Embrace_Rank_3","Twisted_Soul","Living_Shadow","Sharpen_Shadows","Heart_of_Darkness","World_of_Darkness","Dark_Soul","Noblesse_Oblige","Channel_the_Dragons_Spirit","Bare_the_Dragons_Claws","Call_the_Dragons_Rage","Rouse_the_Dragons_Blood","Sovereignty","Magnetize","Body_of_Lightning","Bottled_Lightning","Storm_Wizard_Rank_1","Storm_Wizard_Rank_2","Storm_Wizard_Rank_3","Fey_Law","Passionato_Harmony","Lucky_Clover_Grand_Finale","Magical_Burst","Glamour_Mastery","Enchanting_Transformation","Fiery_Soul","Firebrand","Burning_Passion","Blazing_Inferno","Fire_Breather_Rank_1","Fire_Breather_Rank_2","One_With_the_Winds","Flight","Gale_Speed","Raging_Winds_Rank_1","Raging_Winds_Rank_2","Raging_Winds_Rank_3","Shadow_Arms","Shadow_Form","Too_Spooky","Silent_Assassin","Haunted_Wounds","Phantom_Menace","Green_Path","Overgrowth","Druids_Call","Natures_Embrace_Rank_1","Natures_Embrace_Rank_2","Natures_Embrace_Rank_3","Earthen_Bond","Earth_Mothers_Blessing_Rank_1","Earth_Mothers_Blessing_Rank_2","Earthshifter","Ground_Out","Tectonic_Shift","The_Cold_Never_Bothered_Me_Anyway","Frozen_Domain","Winter_is_Coming","Glacial_Defense","Winters_Herald_Rank_1","Winters_Herald_Rank_2","Blinding_Brightness","Sparkle","Rainbow_Surge","Lucent_Mirage","Prismatic_Alignment","Luminous_Aura","Corrupt_Blood","Flexible_Form","Vile_Body","Miasmas_Call","Miasma_Unleashed","Miasmic_Spray","Stone_Stance","Rock_Power_Rank_1","Rock_Power_Rank_2","Shards_of_Stone","Stone_Cold_Finish","Stone_Stance_Mastery","Champion_of_Steel","Steel_Wind","Reactive_Armour","Impenetrable","Master_of_Arms","Man_of_Steel","Waters_Shroud","Hydro_Jet","Oceanic_Feeling","Call_the_Current_Rank_1","Call_the_Current_Rank_2","Call_the_Current_Rank_3","Item_Mastery","Equipment_Savant","Heros_Journey_Rank_1","Heros_Journey_Rank_2","Heros_Journey_Rank_3","Heros_Journey_Rank_4","Improvised_Gadgets","I_Meant_to_Do_That","Capsule_Science","Enhanced_Capsules","Breadth_of_Knowledge_Playtest","Bookworm_Playtest","Well_Read_Playtest","Echoes_of_the_Future_Playtest","Moment_of_Action_Playtest","Cheers_Playtest","Inspirational_Support_Playtest","Bring_It_On_Playtest","Go_Fight_Win_Playtest","Keep_Fighting_Playtest","Front_Line_Healer","Medical_Techniques_Medic","Im_A_Doctor_Rank_1","Im_A_Doctor_Rank_2","Proper_Care","Stay_With_Us","Nurse","Affliction_Techniques","Gotta_Catch_Em_All_Playtest","Incandescence_Playtest",};
    private String[] genFeats = {"Command_Versatility","Press","Quick_Switch","Species_Savant","Tutoring","Agility_Training","Brutal_Training","Focused_Training","Inspired_Training","Commanders_Voice","Focused_Command","Ravager_Orders","Reckless_Advance","Strike_Again","Marksman_Orders","Trick_Shot","Long_Shot","Trickster_Orders","Capricious_Whirl","Dazzling_Dervish","Guardian_Orders","Brace_for_Impact","Sentinel_Stance","Precision_Orders","Pinpoint_Strike","Perfect_Aim","Blur","Defender","Dive","Fighters_Versatility","MultiTasking","Signature_Move","Type_Expertise","Walk_It_Off","First_Aid_Expertise","Let_Me_Help_You_With_That","Poke_Ball_Crafter","Poke_Ball_Crafter","PokeManiac","PokeManiac","Psionic_Sight","Skill_Monkey","Major_Gift","Pact_Gift","Signer","Sign_Mastery_Rank_1","Sign_Mastery_Rank_2","Sign_Mastery_Rank_3","Sign_Mastery_Rank_4","Messiah","In_My_Name_Rank_1","In_My_Name_Rank_2","In_My_Name_Rank_3","In_My_Name_Rank_4","Branded","Usurper","Shared_Strengths_Rank_1","Shared_Strengths_Rank_2","Shared_Strengths_Rank_3","True_Power","Gift_of_Power","Gift_of_Command","Symbolsight","Giftsapper","Godslayer","Type_Sync","Arcane_Training","Smith_Rank_1","Smith_Rank_2",};
    
    /** 
     * Creates new form PTUCharacterCreatorGUI
     */
    public PTUCharacterCreatorGUI() {
        t = new Trainer();
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jsonRadioButtons = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        characterTab = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        trainerName = new javax.swing.JTextField();
        Level = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        level = new javax.swing.JTextField();
        miscExp = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        featureTab = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        class1 = new javax.swing.JTextField();
        classFeat1 = new javax.swing.JTextField();
        classFeat2 = new javax.swing.JTextField();
        classFeat3 = new javax.swing.JTextField();
        classFeat4 = new javax.swing.JTextField();
        classFeat5 = new javax.swing.JTextField();
        classFeat6 = new javax.swing.JTextField();
        classFeat7 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        class2 = new javax.swing.JTextField();
        classFeat8 = new javax.swing.JTextField();
        classFeat9 = new javax.swing.JTextField();
        classFeat10 = new javax.swing.JTextField();
        classFeat11 = new javax.swing.JTextField();
        classFeat12 = new javax.swing.JTextField();
        classFeat13 = new javax.swing.JTextField();
        classFeat14 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        class3 = new javax.swing.JTextField();
        classFeat15 = new javax.swing.JTextField();
        classFeat16 = new javax.swing.JTextField();
        classFeat17 = new javax.swing.JTextField();
        classFeat18 = new javax.swing.JTextField();
        classFeat19 = new javax.swing.JTextField();
        classFeat20 = new javax.swing.JTextField();
        classFeat21 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        class4 = new javax.swing.JTextField();
        classFeat22 = new javax.swing.JTextField();
        classFeat23 = new javax.swing.JTextField();
        classFeat24 = new javax.swing.JTextField();
        classFeat25 = new javax.swing.JTextField();
        classFeat26 = new javax.swing.JTextField();
        classFeat27 = new javax.swing.JTextField();
        classFeat28 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        usedFeats = new javax.swing.JLabel();
        remainingFeats = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        genFeat1 = new javax.swing.JTextField();
        genFeat2 = new javax.swing.JTextField();
        genFeat4 = new javax.swing.JTextField();
        genFeat5 = new javax.swing.JTextField();
        genFeat7 = new javax.swing.JTextField();
        genFeat8 = new javax.swing.JTextField();
        genFeat10 = new javax.swing.JTextField();
        genFeat12 = new javax.swing.JTextField();
        genFeat13 = new javax.swing.JTextField();
        genFeat15 = new javax.swing.JTextField();
        genFeat16 = new javax.swing.JTextField();
        genFeat18 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        featureLookup = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        featureInfo = new javax.swing.JTextArea();
        addFeature = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        edgeTab = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        acroRank = new javax.swing.JLabel();
        athlRank = new javax.swing.JLabel();
        charmRank = new javax.swing.JLabel();
        combatRank = new javax.swing.JLabel();
        commandRank = new javax.swing.JLabel();
        genEduRank = new javax.swing.JLabel();
        medEduRank = new javax.swing.JLabel();
        ocuEduRank = new javax.swing.JLabel();
        pokeEduRank = new javax.swing.JLabel();
        techEduRank = new javax.swing.JLabel();
        focusRank = new javax.swing.JLabel();
        guileRank = new javax.swing.JLabel();
        intimidateRank = new javax.swing.JLabel();
        intuitionRank = new javax.swing.JLabel();
        perceptionRank = new javax.swing.JLabel();
        stealthRank = new javax.swing.JLabel();
        survivalRank = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        jComboBox24 = new javax.swing.JComboBox<>();
        jComboBox26 = new javax.swing.JComboBox<>();
        jComboBox56 = new javax.swing.JComboBox<>();
        jComboBox62 = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        usedEdges = new javax.swing.JLabel();
        remainingEdges = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        edgeList = new javax.swing.JTextArea();
        jPanel22 = new javax.swing.JPanel();
        edgeName = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        edgeLookup = new javax.swing.JButton();
        addEdgeButton = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        edgeInfo = new javax.swing.JTextArea();
        removeEdge = new javax.swing.JButton();
        combatTab = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel134 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        moveName1 = new javax.swing.JTextField();
        effect1 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        moveName2 = new javax.swing.JTextField();
        effect3 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        moveName3 = new javax.swing.JTextField();
        effect4 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        moveName4 = new javax.swing.JTextField();
        effect5 = new javax.swing.JButton();
        jPanel61 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jLabel315 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        abilityName1 = new javax.swing.JTextField();
        ability1 = new javax.swing.JButton();
        jPanel74 = new javax.swing.JPanel();
        abilityName2 = new javax.swing.JTextField();
        ability2 = new javax.swing.JButton();
        jPanel75 = new javax.swing.JPanel();
        abilityName3 = new javax.swing.JTextField();
        ability3 = new javax.swing.JButton();
        jPanel76 = new javax.swing.JPanel();
        abilityName4 = new javax.swing.JTextField();
        ability4 = new javax.swing.JButton();
        jPanel89 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jLabel382 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        statsLeft = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        hpPoints = new javax.swing.JTextField();
        hpTotal = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        atkPoints = new javax.swing.JTextField();
        atkTotal = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        defPoints = new javax.swing.JTextField();
        defTotal = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        spAtkPoints = new javax.swing.JTextField();
        spAtkTotal = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        spDefPoints = new javax.swing.JTextField();
        spDefTotal = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        spdPoints = new javax.swing.JTextField();
        spdTotal = new javax.swing.JLabel();
        jsonTab = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        txtFileJSON = new javax.swing.JRadioButton();
        clipboardJSON = new javax.swing.JRadioButton();
        txtAreaJSON = new javax.swing.JRadioButton();
        genJSON = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jsonTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(736, 750));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(701, 670));

        characterTab.setPreferredSize(new java.awt.Dimension(696, 650));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(480, 623));

        jLabel1.setText("Background");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel2.setText("Physical Description");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel3.setText("Goals and Aspirations");

        jLabel4.setText("Personality");

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Trainer Advancements");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 5", "General Feature", "Bonus Stats" }));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 10", "Two Edges", "Bonus Stats" }));
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 20", "Two Edges", "Bonus Stats" }));
        jComboBox3.setEnabled(false);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 30", "General Feature", "Two Edges", "Bonus Stats" }));
        jComboBox4.setEnabled(false);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 40", "General Feature", "Two Edges", "Bonus Stats" }));
        jComboBox5.setEnabled(false);
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 50", "General Feature", "Two Edges", "Bonus Stats" }));
        jComboBox6.setEnabled(false);
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel6.setText("Atk");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner1.setEnabled(false);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner2.setEnabled(false);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner3.setEnabled(false);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner4.setEnabled(false);

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner5.setEnabled(false);

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner6.setEnabled(false);

        jLabel7.setText("Sp Atk");

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner7.setEnabled(false);

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner8.setEnabled(false);

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner9.setEnabled(false);

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner10.setEnabled(false);

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner11.setEnabled(false);

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner12.setEnabled(false);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setText("General Feature/Edges");

        jTextField1.setEnabled(false);

        jTextField2.setEnabled(false);

        jTextField3.setEnabled(false);

        jTextField4.setEnabled(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEnabled(false);

        jTextField6.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner1)
                    .addComponent(jSpinner2)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSpinner3)
                    .addComponent(jSpinner6)
                    .addComponent(jSpinner5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox1, jComboBox2, jComboBox3, jComboBox4, jComboBox5, jComboBox6});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jSpinner1, jSpinner10, jSpinner11, jSpinner12, jSpinner2, jSpinner3, jSpinner4, jSpinner5, jSpinner6, jSpinner7, jSpinner8, jSpinner9});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, jSpinner1, jSpinner7, jTextField1});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox2, jSpinner2, jSpinner8, jTextField2});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox3, jSpinner4, jSpinner9, jTextField4});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox4, jSpinner10, jSpinner3, jTextField3});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox5, jSpinner11, jSpinner6, jTextField6});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox6, jSpinner12, jSpinner5, jTextField5});

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel81.setText("Name:");

        trainerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });

        Level.setText("Level:");

        jLabel82.setText("Misc Exp:");

        jLabel83.setText("Gender:");

        jLabel84.setText("Height:");

        height.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                heightType(evt);
            }
        });

        jLabel85.setText("Weight:");

        weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                weightKeyTyped(evt);
            }
        });

        level.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        level.setText("1");
        level.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                levelKeyPressed(evt);
            }
        });

        miscExp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        miscExp.setText("0");
        miscExp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                miscExpKeyPressed(evt);
            }
        });

        gender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                genderKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trainerName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(Level)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(miscExp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(trainerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Level)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83)
                    .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miscExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3)
                        .addGap(164, 164, 164)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane2, jScrollPane3});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane4, jScrollPane5});

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(216, 72));

        jButton1.setText("Create Character");

        jButton2.setText("Level-Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Charactermancer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton6.setText("Import Picture");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout characterTabLayout = new javax.swing.GroupLayout(characterTab);
        characterTab.setLayout(characterTabLayout);
        characterTabLayout.setHorizontalGroup(
            characterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(characterTabLayout.createSequentialGroup()
                .addComponent(jPanel2, 482, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(characterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        characterTabLayout.setVerticalGroup(
            characterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(characterTabLayout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Character", characterTab);

        featureTab.setPreferredSize(new java.awt.Dimension(696, 600));

        jPanel5.setPreferredSize(new java.awt.Dimension(696, 240));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setToolTipText("Class 1");
        jPanel6.setName("Class 1"); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(348, 120));

        class1.setEditable(false);

        classFeat1.setEditable(false);

        classFeat2.setEditable(false);

        classFeat3.setEditable(false);

        classFeat4.setEditable(false);

        classFeat5.setEditable(false);

        classFeat6.setEditable(false);
        classFeat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classFeat6ActionPerformed(evt);
            }
        });

        classFeat7.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classFeat1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(classFeat2))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classFeat5)
                            .addComponent(classFeat7)
                            .addComponent(classFeat4))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(classFeat3, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(classFeat6)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(class1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(class1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classFeat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classFeat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(classFeat7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(348, 120));

        class2.setEditable(false);

        classFeat8.setEditable(false);

        classFeat9.setEditable(false);

        classFeat10.setEditable(false);

        classFeat11.setEditable(false);

        classFeat12.setEditable(false);

        classFeat13.setEditable(false);

        classFeat14.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classFeat8)
                    .addComponent(classFeat9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classFeat12, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(classFeat14)
                    .addComponent(classFeat11))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classFeat10)
                    .addComponent(classFeat13, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(class2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(class2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classFeat8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classFeat9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(classFeat14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        class3.setEditable(false);

        classFeat15.setEditable(false);

        classFeat16.setEditable(false);

        classFeat17.setEditable(false);

        classFeat18.setEditable(false);

        classFeat19.setEditable(false);

        classFeat20.setEditable(false);

        classFeat21.setEditable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classFeat15)
                    .addComponent(classFeat16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classFeat19, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(classFeat21)
                    .addComponent(classFeat18))
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classFeat17)
                    .addComponent(classFeat20, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(class3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(class3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classFeat15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classFeat16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(classFeat21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        class4.setEditable(false);
        class4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class4ActionPerformed(evt);
            }
        });

        classFeat22.setEditable(false);

        classFeat23.setEditable(false);

        classFeat24.setEditable(false);

        classFeat25.setEditable(false);

        classFeat26.setEditable(false);

        classFeat27.setEditable(false);

        classFeat28.setEditable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classFeat22)
                    .addComponent(classFeat23, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classFeat26, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(classFeat28)
                    .addComponent(classFeat25))
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classFeat24)
                    .addComponent(classFeat27, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(class4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(class4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classFeat22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classFeat23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classFeat27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(classFeat28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setPreferredSize(new java.awt.Dimension(696, 32));

        usedFeats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usedFeats.setText(("Features Used: " + t.getFeaturesTotal()));

        remainingFeats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        remainingFeats.setText("Features Remaining: " + t.getFeaturesRemaining());

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usedFeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(remainingFeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(usedFeats)
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(remainingFeats)
                .addGap(0, 0, 0))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setPreferredSize(new java.awt.Dimension(696, 120));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("General Features");

        genFeat1.setEditable(false);

        genFeat2.setEditable(false);

        genFeat4.setEditable(false);

        genFeat5.setEditable(false);

        genFeat7.setEditable(false);

        genFeat8.setEditable(false);

        genFeat10.setEditable(false);

        genFeat12.setEditable(false);

        genFeat13.setEditable(false);

        genFeat15.setEditable(false);

        genFeat16.setEditable(false);

        genFeat18.setEditable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genFeat1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genFeat2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genFeat4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genFeat5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genFeat7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genFeat8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genFeat10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genFeat12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genFeat13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genFeat15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genFeat16, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genFeat18, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(genFeat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genFeat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(genFeat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genFeat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(genFeat7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genFeat8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(genFeat10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genFeat12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(genFeat13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genFeat15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(genFeat16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genFeat18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(696, 120));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Feature Lookup");

        featureLookup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                featureLookupActionPerformed(evt);
            }
        });

        featureInfo.setEditable(false);
        featureInfo.setColumns(20);
        featureInfo.setRows(5);
        jScrollPane1.setViewportView(featureInfo);

        addFeature.setText("Add Feature");
        addFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFeatureActionPerformed(evt);
            }
        });

        jButton8.setText("Find Feature");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Remove Feature");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addFeature)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(featureLookup, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(featureLookup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFeature)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout featureTabLayout = new javax.swing.GroupLayout(featureTab);
        featureTab.setLayout(featureTabLayout);
        featureTabLayout.setHorizontalGroup(
            featureTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(featureTabLayout.createSequentialGroup()
                .addGroup(featureTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        featureTabLayout.setVerticalGroup(
            featureTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(featureTabLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Features", featureTab);

        edgeTab.setPreferredSize(new java.awt.Dimension(696, 600));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setText("Acrobatics");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setText("Athletics");

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel16.setText("Charm");

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel17.setText("Combat");

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel18.setText("Command");

        jLabel19.setText("General Edu");

        jLabel20.setText("Medicine Edu");

        jLabel21.setText("Occult Edu");

        jLabel22.setText("Pokemon Edu");

        jLabel23.setText("Tech Edu");

        jLabel24.setText("Focus");

        jLabel25.setText("Guile");

        jLabel26.setText("Intimidate");

        jLabel27.setText("Intuition");

        jLabel28.setText("Perception");

        jLabel29.setText("Stealth");

        jLabel30.setText("Survival");

        acroRank.setText("2d6");

        athlRank.setText("2d6");

        charmRank.setText("2d6");

        combatRank.setText("2d6");

        commandRank.setText("2d6");

        genEduRank.setText("2d6");

        medEduRank.setText("2d6");

        ocuEduRank.setText("2d6");

        pokeEduRank.setText("2d6");

        techEduRank.setText("2d6");

        focusRank.setText("2d6");

        guileRank.setText("2d6");

        intimidateRank.setText("2d6");

        intuitionRank.setText("2d6");

        perceptionRank.setText("2d6");

        stealthRank.setText("2d6");

        survivalRank.setText("2d6");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator6)
            .addComponent(jSeparator7)
            .addComponent(jSeparator8)
            .addComponent(jSeparator9)
            .addComponent(jSeparator10)
            .addComponent(jSeparator11)
            .addComponent(jSeparator12)
            .addComponent(jSeparator13)
            .addComponent(jSeparator14)
            .addComponent(jSeparator15)
            .addComponent(jSeparator16)
            .addComponent(jSeparator17, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator18)
            .addComponent(jSeparator19)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acroRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(survivalRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(athlRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(charmRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combatRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(commandRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genEduRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medEduRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ocuEduRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pokeEduRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(techEduRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(focusRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guileRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(intimidateRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(intuitionRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(perceptionRank))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stealthRank)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(acroRank))
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(athlRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(charmRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(combatRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(commandRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(genEduRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(medEduRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(ocuEduRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(pokeEduRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(techEduRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(focusRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(guileRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(intimidateRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(intuitionRank))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(perceptionRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(stealthRank))
                .addGap(4, 4, 4)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(survivalRank))
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setPreferredSize(new java.awt.Dimension(156, 170));

        jLabel48.setText("Adept");

        jLabel49.setText("Pahtetic");

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel50.setText("Novice");

        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox56.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox62.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel49))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox24, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jComboBox56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usedEdges.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usedEdges.setText("Edges Used: " + t.getEdgesTotal());

        remainingEdges.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        remainingEdges.setText("Edges Remaining: " + t.getEdgesRemaining());

        edgeList.setEditable(false);
        edgeList.setColumns(20);
        edgeList.setRows(5);
        jScrollPane9.setViewportView(edgeList);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usedEdges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(remainingEdges, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(usedEdges)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remainingEdges)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel59.setText("Edge Lookup");

        edgeLookup.setText("Look up Edge");
        edgeLookup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edgeLookupActionPerformed(evt);
            }
        });

        addEdgeButton.setText("Add Edge");
        addEdgeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEdgeButtonActionPerformed(evt);
            }
        });

        edgeInfo.setColumns(20);
        edgeInfo.setRows(5);
        jScrollPane8.setViewportView(edgeInfo);

        removeEdge.setText("Remove Edge");
        removeEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEdgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel59)
                    .addComponent(removeEdge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addEdgeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edgeLookup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edgeName))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(20, 20, 20)
                        .addComponent(edgeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edgeLookup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addEdgeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeEdge)
                        .addGap(0, 126, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout edgeTabLayout = new javax.swing.GroupLayout(edgeTab);
        edgeTab.setLayout(edgeTabLayout);
        edgeTabLayout.setHorizontalGroup(
            edgeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edgeTabLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(edgeTabLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        edgeTabLayout.setVerticalGroup(
            edgeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edgeTabLayout.createSequentialGroup()
                .addGroup(edgeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(edgeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        edgeTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel13, jPanel14});

        jTabbedPane1.addTab("Edges", edgeTab);

        combatTab.setPreferredSize(new java.awt.Dimension(714, 651));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList1);

        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel134.setText("Capabilities");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
            .addComponent(jLabel134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel134)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel53.setText("Moves");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel53)
                .addGap(6, 6, 6))
        );

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        moveName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                moveName1KeyPressed(evt);
            }
        });

        effect1.setText("Show Move");
        effect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effect1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moveName1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(effect1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moveName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(effect1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        moveName2.setEditable(false);
        moveName2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                moveName2KeyPressed(evt);
            }
        });

        effect3.setText("Show Move");
        effect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effect3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moveName2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(effect3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moveName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(effect3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        moveName3.setEditable(false);
        moveName3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                moveName3KeyPressed(evt);
            }
        });

        effect4.setText("Show Move");
        effect4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effect4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moveName3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(effect4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moveName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(effect4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        moveName4.setEditable(false);
        moveName4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                moveName4KeyPressed(evt);
            }
        });

        effect5.setText("Show Move");
        effect5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effect5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moveName4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(effect5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moveName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(effect5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel315.setText("Ability");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel315, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel315)
                .addGap(6, 6, 6))
        );

        jPanel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        abilityName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                abilityName1KeyPressed(evt);
            }
        });

        ability1.setText("Show Effect");
        ability1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ability1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abilityName1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ability1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abilityName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ability1))
                .addGap(5, 5, 5))
        );

        jPanel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        abilityName2.setEditable(false);

        ability2.setText("Show Effect");

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abilityName2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ability2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abilityName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ability2))
                .addGap(5, 5, 5))
        );

        jPanel75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        abilityName3.setEditable(false);

        ability3.setText("Show Effect");

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abilityName3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ability3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abilityName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ability3))
                .addGap(5, 5, 5))
        );

        jPanel76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        abilityName4.setEditable(false);

        ability4.setText("Show Effect");

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abilityName4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ability4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abilityName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ability4))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel382.setText("Stat");
        jLabel382.setPreferredSize(new java.awt.Dimension(55, 13));

        jLabel60.setText("Base");

        statsLeft.setText("" + t.getStatPointsRemaining());

        jLabel62.setText("Points");

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel382, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel60)
                .addGap(18, 18, 18)
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addComponent(statsLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel382, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(statsLeft)
                    .addComponent(jLabel62))
                .addGap(3, 3, 3))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel63.setText("HP");
        jLabel63.setPreferredSize(new java.awt.Dimension(60, 13));

        jLabel64.setText(String.valueOf(getHPBase())
        );

        hpPoints.setText("0");
        hpPoints.setPreferredSize(new java.awt.Dimension(30, 20));
        hpPoints.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hpPointsKeyPressed(evt);
            }
        });
        hpPoints.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = hpPoints.getText();
                int l = value.length();
                if (((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                    hpPoints.setEditable(true);
                } else {
                    hpPoints.setEditable(false);
                }
            }
        });

        hpTotal.setText(String.valueOf(getHPBase()));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel64)
                .addGap(18, 18, 18)
                .addComponent(hpPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hpTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(hpPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hpTotal))
                .addGap(3, 3, 3))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel66.setText("Attack");
        jLabel66.setPreferredSize(new java.awt.Dimension(60, 13));

        jLabel67.setText(String.valueOf(getAtkBase())
        );

        atkPoints.setText("0");
        atkPoints.setPreferredSize(new java.awt.Dimension(30, 20));
        atkPoints.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                atkPointsKeyPressed(evt);
            }
        });
        hpPoints.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = hpPoints.getText();
                int l = value.length();
                if (((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                    hpPoints.setEditable(true);
                } else {
                    hpPoints.setEditable(false);
                }
            }
        });

        atkTotal.setText(String.valueOf(getAtkBase()));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel67)
                .addGap(18, 18, 18)
                .addComponent(atkPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atkTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(atkPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atkTotal))
                .addGap(3, 3, 3))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel69.setText("Defense");
        jLabel69.setPreferredSize(new java.awt.Dimension(60, 13));

        jLabel70.setText(String.valueOf(getDefBase())
        );

        defPoints.setText("0");
        defPoints.setPreferredSize(new java.awt.Dimension(30, 20));
        defPoints.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                defPointsKeyPressed(evt);
            }
        });
        hpPoints.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = hpPoints.getText();
                int l = value.length();
                if (((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                    hpPoints.setEditable(true);
                } else {
                    hpPoints.setEditable(false);
                }
            }
        });

        defTotal.setText(String.valueOf(getDefBase()));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel70)
                .addGap(18, 18, 18)
                .addComponent(defPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(defTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(defPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(defTotal))
                .addGap(3, 3, 3))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel72.setText("Sp Attack");
        jLabel72.setPreferredSize(new java.awt.Dimension(60, 13));

        jLabel73.setText(String.valueOf(getSpAtkBase())
        );

        spAtkPoints.setText("0");
        spAtkPoints.setPreferredSize(new java.awt.Dimension(30, 20));
        spAtkPoints.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spAtkPointsKeyPressed(evt);
            }
        });
        hpPoints.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = hpPoints.getText();
                int l = value.length();
                if (((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                    hpPoints.setEditable(true);
                } else {
                    hpPoints.setEditable(false);
                }
            }
        });

        spAtkTotal.setText(String.valueOf(getSpAtkBase()));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel73)
                .addGap(18, 18, 18)
                .addComponent(spAtkPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spAtkTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(spAtkPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spAtkTotal))
                .addGap(3, 3, 3))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel93.setText("Sp Defense");
        jLabel93.setPreferredSize(new java.awt.Dimension(60, 13));

        jLabel94.setText(String.valueOf(getSpDefBase())
        );

        spDefPoints.setText("0");
        spDefPoints.setPreferredSize(new java.awt.Dimension(30, 20));
        spDefPoints.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spDefPointsKeyPressed(evt);
            }
        });
        hpPoints.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = hpPoints.getText();
                int l = value.length();
                if (((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                    hpPoints.setEditable(true);
                } else {
                    hpPoints.setEditable(false);
                }
            }
        });

        spDefTotal.setText(String.valueOf(getSpDefBase()));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel94)
                .addGap(18, 18, 18)
                .addComponent(spDefPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spDefTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94)
                    .addComponent(spDefPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spDefTotal))
                .addGap(3, 3, 3))
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel96.setText("Speed");
        jLabel96.setPreferredSize(new java.awt.Dimension(60, 13));

        jLabel97.setText(String.valueOf(getSpdBase())
        );

        spdPoints.setText("0");
        spdPoints.setPreferredSize(new java.awt.Dimension(30, 20));
        spdPoints.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spdPointsKeyPressed(evt);
            }
        });
        hpPoints.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = hpPoints.getText();
                int l = value.length();
                if (((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                    hpPoints.setEditable(true);
                } else {
                    hpPoints.setEditable(false);
                }
            }
        });

        spdTotal.setText(String.valueOf(getSpdBase()));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel97)
                .addGap(18, 18, 18)
                .addComponent(spdPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spdTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97)
                    .addComponent(spdPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spdTotal))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout combatTabLayout = new javax.swing.GroupLayout(combatTab);
        combatTab.setLayout(combatTabLayout);
        combatTabLayout.setHorizontalGroup(
            combatTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(combatTabLayout.createSequentialGroup()
                .addGroup(combatTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        combatTabLayout.setVerticalGroup(
            combatTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(combatTabLayout.createSequentialGroup()
                .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Combat", combatTab);

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jsonRadioButtons.add(txtFileJSON);
        txtFileJSON.setText("Export to .txt File");

        jsonRadioButtons.add(clipboardJSON);
        clipboardJSON.setText("Export to Clipboard");

        jsonRadioButtons.add(txtAreaJSON);
        txtAreaJSON.setSelected(true);
        txtAreaJSON.setText("Export to Text Area");

        genJSON.setText("Generate JSON");
        genJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genJSONActionPerformed(evt);
            }
        });

        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel56.setText("Trainer");

        jLabel57.setText("Pokemon");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAreaJSON)
                            .addComponent(txtFileJSON)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(clipboardJSON)
                                .addGap(50, 50, 50)
                                .addComponent(genJSON))))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel56)))
                .addGap(66, 66, 66)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(jLabel57)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator20)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(30, 30, 30)
                        .addComponent(txtFileJSON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clipboardJSON)
                            .addComponent(genJSON))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAreaJSON))
                    .addComponent(jLabel57))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel58.setText("JSON");

        jsonTextArea.setColumns(20);
        jsonTextArea.setRows(5);
        jScrollPane7.setViewportView(jsonTextArea);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel58)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jsonTabLayout = new javax.swing.GroupLayout(jsonTab);
        jsonTab.setLayout(jsonTabLayout);
        jsonTabLayout.setHorizontalGroup(
            jsonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jsonTabLayout.setVerticalGroup(
            jsonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jsonTabLayout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        jTabbedPane1.addTab("JSON", jsonTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void featureLookupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_featureLookupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_featureLookupActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

    private void effect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effect1ActionPerformed
        // TODO add your handling code here:
        try {
            Class<Move> move = (Class<Move>)Class.forName("PTUCharacterCreator.Moves." + moveName1.getText().replace(" ", "_").replace("'","_"));
            Move tempMove = (Move) move.getDeclaredConstructor().newInstance();
            showMove(tempMove);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(null, null, ex);
            JOptionPane.showMessageDialog(null,"Not a Move");
        }
    }//GEN-LAST:event_effect1ActionPerformed
    
    private void showMove(Move move){
        String temp = "Name: " + move.getName() + "\n";
        temp += "DB: " + move.getMDB() + "\n";
        temp += "Freq: " + move.getFreq() + "\n";
        temp += "AC: " + move.getAC() + "\n";
        temp += "Category: " + move.getCategory() + "\n";
        temp += "Range: " + move.getRange() + "\n";
        String effect = "Effect: " + move.getEffect() + "\n";
        boolean flag = false;
        for(int i = 0; i < effect.length(); i++){
            if(flag && effect.charAt(i) == ' '){
                temp += "\n";
                flag = false;
            }else if(i%50 == 0 && i != 0){
                flag = true;
            }
            temp += effect.charAt(i);
        }
        JOptionPane.showMessageDialog(null, temp);
    }
    
    private void enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enter
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.setName(trainerName.getText());
        }
    }//GEN-LAST:event_enter

    private void heightType(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightType
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.setHeight(height.getText());
        }
    }//GEN-LAST:event_heightType

    private void weightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightKeyTyped
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.setWC(Integer.parseInt(weight.getText()));
        }
    }//GEN-LAST:event_weightKeyTyped

    private void genderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genderKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.setGender(gender.getText());
        }
    }//GEN-LAST:event_genderKeyPressed

    private void levelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_levelKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            int temp = Integer.parseInt(level.getText());
            t.setLevel(temp);
            usedFeats.setText("Features Used: " + t.getFeaturesTotal());
            remainingFeats.setText("Features Remaining: " + t.getFeaturesRemaining());
            usedEdges.setText("Edges Used: " + t.getEdgesTotal());
            remainingEdges.setText("Edges Remaining: " + t.getEdgesRemaining());
        }
        if (((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
               hpPoints.setEditable(true);  
        } else {
               hpPoints.setEditable(false);
        }
    
    }//GEN-LAST:event_levelKeyPressed

    private void miscExpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_miscExpKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.setMiscExp(Integer.parseInt(miscExp.getText()));
        }
        if (((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && miscExp.getText().length() == 0) || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
               hpPoints.setEditable(true);  
        } else {
               hpPoints.setEditable(false);
        }
    }//GEN-LAST:event_miscExpKeyPressed

    private void class4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_class4ActionPerformed

    private void genJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genJSONActionPerformed
        // TODO finish code for CLipboard and text file
        if(txtAreaJSON.isSelected()){
            jsonTextArea.setText(t.generateJSON());
        }else if(clipboardJSON.isSelected()){
            
        }else if(txtFileJSON.isSelected()){
            
        }
    }//GEN-LAST:event_genJSONActionPerformed

    private void addFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFeatureActionPerformed
        // TODO add your handling code here:
        int bonus = JOptionPane.showConfirmDialog(null,"Bonus Feat?");
        t.addFeature(featureLookup.getText(), bonus);
        updateStats();
    }//GEN-LAST:event_addFeatureActionPerformed

    private void edgeLookupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edgeLookupActionPerformed
        // TODO add your handling code here:
         try {
            Class<Edge> edge = (Class<Edge>)Class.forName("PTUCharacterCreator.Edges." + edgeName.getText().replace(" ", "_"));
            Edge tempEdge = (Edge) edge.getDeclaredConstructor().newInstance();
            edgeInfo.setText(tempEdge.getEffect());
            
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(null, null, ex);
        }
    }//GEN-LAST:event_edgeLookupActionPerformed

    private void addEdgeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEdgeButtonActionPerformed
        // TODO add your handling code here:
        int bonus = JOptionPane.showConfirmDialog(null,"Bonus Edge?");
        boolean flag = t.addEdge(edgeName.getText().replace(" ", "_"), bonus);
        if(flag){
            updateSkills();
            updateEdges();
        }
    }//GEN-LAST:event_addEdgeButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try {
            Class<Feature> feat = (Class<Feature>)Class.forName("PTUCharacterCreator.Feats." + featureLookup.getText().replace(" ", "_"));
            Feature tempFeat = (Feature) feat.getDeclaredConstructor().newInstance();
            featureInfo.setText(tempFeat.getEffect());
            
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(null, null, ex);
            JOptionPane.showMessageDialog(null,featureLookup.getText());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void moveName1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_moveName1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(t.addMove(moveName1.getText().replace(" ", "_").replace("'", ""),1)){
                moveName2.setEnabled(true);
            }
        }
    }//GEN-LAST:event_moveName1KeyPressed

    private void removeEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEdgeActionPerformed
        // TODO add your handling code here:
        t.removeEdge(edgeName.getText().replace(" ", "_"));
        updateSkills();
        updateEdges();
    }//GEN-LAST:event_removeEdgeActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        t.removeFeat(featureLookup.getText().replace(" ", "_"));
        updateStats();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void classFeat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classFeat6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classFeat6ActionPerformed

    private void moveName2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_moveName2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(t.addMove(moveName2.getText().replace(" ", "_").replace("'", ""),1)){
                moveName3.setEnabled(true);
            }
        }
    }//GEN-LAST:event_moveName2KeyPressed

    private void effect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effect3ActionPerformed
        // TODO add your handling code here:
        try {
            Class<Move> move = (Class<Move>)Class.forName("PTUCharacterCreator.Moves." + moveName2.getText().replace(" ", "_").replace("'","_"));
            Move tempMove = (Move) move.getDeclaredConstructor().newInstance();
            showMove(tempMove);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(null, null, ex);
            JOptionPane.showMessageDialog(null,"Not a Move");
        }
    }//GEN-LAST:event_effect3ActionPerformed

    private void moveName3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_moveName3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(t.addMove(moveName3.getText().replace(" ", "_").replace("'", ""),1)){
                moveName4.setEnabled(true);
            }
        }
    }//GEN-LAST:event_moveName3KeyPressed

    private void effect4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effect4ActionPerformed
        // TODO add your handling code here:
        try {
            Class<Move> move = (Class<Move>)Class.forName("PTUCharacterCreator.Moves." + moveName3.getText().replace(" ", "_").replace("'","_"));
            Move tempMove = (Move) move.getDeclaredConstructor().newInstance();
            showMove(tempMove);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(null, null, ex);
            JOptionPane.showMessageDialog(null,"Not a Move");
        }
    }//GEN-LAST:event_effect4ActionPerformed

    private void moveName4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_moveName4KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.addMove(moveName4.getText().replace(" ", "_").replace("'", ""),4);
        }
    }//GEN-LAST:event_moveName4KeyPressed

    private void effect5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effect5ActionPerformed
        // TODO add your handling code here:
        try {
            Class<Move> move = (Class<Move>)Class.forName("PTUCharacterCreator.Moves." + moveName4.getText().replace(" ", "_").replace("'","_"));
            Move tempMove = (Move) move.getDeclaredConstructor().newInstance();
            showMove(tempMove);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(null, null, ex);
            JOptionPane.showMessageDialog(null,"Not a Move");
        }
    }//GEN-LAST:event_effect5ActionPerformed

    private void abilityName1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_abilityName1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(t.addAbility(abilityName1.getText().replace(" ", "_").replace("'", ""),1)){
                abilityName2.setEnabled(true);
            }
        }
    }//GEN-LAST:event_abilityName1KeyPressed

    private void ability1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ability1ActionPerformed
        // TODO add your handling code here:
        try {
            Class<Ability> ability = (Class<Ability>)Class.forName("PTUCharacterCreator.Abilities." + abilityName1.getText().replace(" ", "_").replace("'","_"));   
            Ability tempAbility = (Ability) ability.getDeclaredConstructor().newInstance();
            showAbility(tempAbility);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Trainer.class.getName()).log(null, null, ex);
            JOptionPane.showMessageDialog(null,"Not an Ability");
        }
    }//GEN-LAST:event_ability1ActionPerformed

    private void hpPointsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hpPointsKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.incLHP(Integer.parseInt(hpPoints.getText()));
            updateStats();
        }
    }//GEN-LAST:event_hpPointsKeyPressed

    private void atkPointsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atkPointsKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.incLAtk(Integer.parseInt(atkPoints.getText()));
            updateStats();
        }
    }//GEN-LAST:event_atkPointsKeyPressed

    private void defPointsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_defPointsKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.incLDef(Integer.parseInt(defPoints.getText()));
            updateStats();
        }
    }//GEN-LAST:event_defPointsKeyPressed

    private void spAtkPointsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spAtkPointsKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.incLSpAtk(Integer.parseInt(spAtkPoints.getText()));
            updateStats();
        }
    }//GEN-LAST:event_spAtkPointsKeyPressed

    private void spDefPointsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spDefPointsKeyPressed
        // TODO add your handling code here
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.incLSpDef(Integer.parseInt(spDefPoints.getText()));
            updateStats();
        }
    }//GEN-LAST:event_spDefPointsKeyPressed

    private void spdPointsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spdPointsKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t.incLSpd(Integer.parseInt(spdPoints.getText()));
            updateStats();
        }
    }//GEN-LAST:event_spdPointsKeyPressed
    
    private void updateStats(){
        int[] temp = t.getStats();
        hpTotal.setText("" + (temp[0] + getHPBase()));
        atkTotal.setText("" + (temp[1] + getAtkBase()));
        defTotal.setText("" + (temp[2] + getDefBase()));
        spAtkTotal.setText("" + (temp[3] + getSpAtkBase()));
        spDefTotal.setText("" + (temp[4] + getSpDefBase()));
        spdTotal.setText("" + (temp[5] + getSpdBase()));
        statsLeft.setText("" + t.getStatPointsRemaining());
    }
    private void showAbility(Ability ability){
        String temp = "Name: " + ability.getName() + "\n";
        temp += "Freq: " + ability.getFreq() + "\n";
        String effect = "Effect: " + ability.getEffect().replace("\n","") + "\n";
        boolean flag = false;
        for(int i = 0; i < effect.length(); i++){
            if(flag && effect.charAt(i) == ' '){
                temp += "\n";
                flag = false;
            }else if(i%50 == 0 && i != 0){
                flag = true;
            }
            temp += effect.charAt(i);
        }
        JOptionPane.showMessageDialog(null, temp);
    }
    private int getAtkBase(){
        return 5;
    }
    
    private int getHPBase(){
        return 10;
    }
    
    private int getDefBase(){
        return 5;
    }
    
    private int getSpAtkBase(){
        return 5;
    }
    
    private int getSpDefBase(){
        return 5;
    }
    
    private int getSpdBase(){
        return 5;
    }
    
    private void updateEdges(){
        ArrayList<Edge> edges = t.getEdges();
        String temp = "";
        for(Edge edge : edges){
            temp += edge.getName() + ", ";
        }
        String result = "";
        for(int i = 0; i < temp.length(); i++){
            if(i%100 == 0 && i != 0){
                result += "\n";
            }
            result += temp.charAt(i);
        }
        edgeList.setText(result);
        usedEdges.setText("Edges Used: " + t.getEdgesTotal());
        remainingEdges.setText("Edges Remaining: " + t.getEdgesRemaining());
    }
    
    private void updateSkills(){
        acroRank.setText("" + t.getSkill("Acrobatics") + "d6");
        athlRank.setText("" + t.getSkill("Athletics") + "d6");
        charmRank.setText("" + t.getSkill("Charm") + "d6");
        combatRank.setText("" + t.getSkill("Combat") + "d6");
        commandRank.setText("" + t.getSkill("Command") + "d6");
        genEduRank.setText("" + t.getSkill("Gen Edu") + "d6");
        techEduRank.setText("" + t.getSkill("Tech Edu") + "d6");
        medEduRank.setText("" + t.getSkill("Med Edu") + "d6");
        pokeEduRank.setText("" + t.getSkill("Pokemon Edu") + "d6");
        ocuEduRank.setText("" + t.getSkill("Ocu Edu") + "d6");
        focusRank.setText("" + t.getSkill("Focus") + "d6");
        guileRank.setText("" + t.getSkill("Guile") + "d6");
        intimidateRank.setText("" + t.getSkill("Intimidate") + "d6");
        intuitionRank.setText("" + t.getSkill("Intuition") + "d6");
        perceptionRank.setText("" + t.getSkill("Perception") + "d6");
        stealthRank.setText("" + t.getSkill("Stealth") + "d6");
        survivalRank.setText("" + t.getSkill("Survival") + "d6");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PTUCharacterCreatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PTUCharacterCreatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PTUCharacterCreatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PTUCharacterCreatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PTUCharacterCreatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Level;
    private javax.swing.JButton ability1;
    private javax.swing.JButton ability2;
    private javax.swing.JButton ability3;
    private javax.swing.JButton ability4;
    private javax.swing.JTextField abilityName1;
    private javax.swing.JTextField abilityName2;
    private javax.swing.JTextField abilityName3;
    private javax.swing.JTextField abilityName4;
    private javax.swing.JLabel acroRank;
    private javax.swing.JButton addEdgeButton;
    private javax.swing.JButton addFeature;
    private javax.swing.JLabel athlRank;
    private javax.swing.JTextField atkPoints;
    private javax.swing.JLabel atkTotal;
    private javax.swing.JPanel characterTab;
    private javax.swing.JLabel charmRank;
    private javax.swing.JTextField class1;
    private javax.swing.JTextField class2;
    private javax.swing.JTextField class3;
    private javax.swing.JTextField class4;
    private javax.swing.JTextField classFeat1;
    private javax.swing.JTextField classFeat10;
    private javax.swing.JTextField classFeat11;
    private javax.swing.JTextField classFeat12;
    private javax.swing.JTextField classFeat13;
    private javax.swing.JTextField classFeat14;
    private javax.swing.JTextField classFeat15;
    private javax.swing.JTextField classFeat16;
    private javax.swing.JTextField classFeat17;
    private javax.swing.JTextField classFeat18;
    private javax.swing.JTextField classFeat19;
    private javax.swing.JTextField classFeat2;
    private javax.swing.JTextField classFeat20;
    private javax.swing.JTextField classFeat21;
    private javax.swing.JTextField classFeat22;
    private javax.swing.JTextField classFeat23;
    private javax.swing.JTextField classFeat24;
    private javax.swing.JTextField classFeat25;
    private javax.swing.JTextField classFeat26;
    private javax.swing.JTextField classFeat27;
    private javax.swing.JTextField classFeat28;
    private javax.swing.JTextField classFeat3;
    private javax.swing.JTextField classFeat4;
    private javax.swing.JTextField classFeat5;
    private javax.swing.JTextField classFeat6;
    private javax.swing.JTextField classFeat7;
    private javax.swing.JTextField classFeat8;
    private javax.swing.JTextField classFeat9;
    private javax.swing.JRadioButton clipboardJSON;
    private javax.swing.JLabel combatRank;
    private javax.swing.JPanel combatTab;
    private javax.swing.JLabel commandRank;
    private javax.swing.JTextField defPoints;
    private javax.swing.JLabel defTotal;
    private javax.swing.JTextArea edgeInfo;
    private javax.swing.JTextArea edgeList;
    private javax.swing.JButton edgeLookup;
    private javax.swing.JTextField edgeName;
    private javax.swing.JPanel edgeTab;
    private javax.swing.JButton effect1;
    private javax.swing.JButton effect3;
    private javax.swing.JButton effect4;
    private javax.swing.JButton effect5;
    private javax.swing.JTextArea featureInfo;
    private javax.swing.JTextField featureLookup;
    private javax.swing.JPanel featureTab;
    private javax.swing.JLabel focusRank;
    private javax.swing.JLabel genEduRank;
    private javax.swing.JTextField genFeat1;
    private javax.swing.JTextField genFeat10;
    private javax.swing.JTextField genFeat12;
    private javax.swing.JTextField genFeat13;
    private javax.swing.JTextField genFeat15;
    private javax.swing.JTextField genFeat16;
    private javax.swing.JTextField genFeat18;
    private javax.swing.JTextField genFeat2;
    private javax.swing.JTextField genFeat4;
    private javax.swing.JTextField genFeat5;
    private javax.swing.JTextField genFeat7;
    private javax.swing.JTextField genFeat8;
    private javax.swing.JButton genJSON;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel guileRank;
    private javax.swing.JTextField height;
    private javax.swing.JTextField hpPoints;
    private javax.swing.JLabel hpTotal;
    private javax.swing.JLabel intimidateRank;
    private javax.swing.JLabel intuitionRank;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox56;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox62;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.ButtonGroup jsonRadioButtons;
    private javax.swing.JPanel jsonTab;
    private javax.swing.JTextArea jsonTextArea;
    private javax.swing.JTextField level;
    private javax.swing.JLabel medEduRank;
    private javax.swing.JTextField miscExp;
    private javax.swing.JTextField moveName1;
    private javax.swing.JTextField moveName2;
    private javax.swing.JTextField moveName3;
    private javax.swing.JTextField moveName4;
    private javax.swing.JLabel ocuEduRank;
    private javax.swing.JLabel perceptionRank;
    private javax.swing.JLabel pokeEduRank;
    private javax.swing.JLabel remainingEdges;
    private javax.swing.JLabel remainingFeats;
    private javax.swing.JButton removeEdge;
    private javax.swing.JTextField spAtkPoints;
    private javax.swing.JLabel spAtkTotal;
    private javax.swing.JTextField spDefPoints;
    private javax.swing.JLabel spDefTotal;
    private javax.swing.JTextField spdPoints;
    private javax.swing.JLabel spdTotal;
    private javax.swing.JLabel statsLeft;
    private javax.swing.JLabel stealthRank;
    private javax.swing.JLabel survivalRank;
    private javax.swing.JLabel techEduRank;
    private javax.swing.JTextField trainerName;
    private javax.swing.JRadioButton txtAreaJSON;
    private javax.swing.JRadioButton txtFileJSON;
    private javax.swing.JLabel usedEdges;
    private javax.swing.JLabel usedFeats;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
    private class MKeyListener extends KeyAdapter {
        private JTextField t;
        public MKeyListener(JTextField t){
            this.t = t;
        }
        
        @Override
        public void keyPressed(KeyEvent event) {
            if(event.getKeyCode() == KeyEvent.VK_ENTER){
                
            }
        }
        
        
    }
}
