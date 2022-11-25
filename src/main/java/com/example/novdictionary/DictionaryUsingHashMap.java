package com.example.novdictionary;

import java.util.HashMap;
import java.util.Map;

public class DictionaryUsingHashMap {
 private HashMap<String,String> dictionary;
 public DictionaryUsingHashMap(){

     dictionary = new HashMap<String, String>();
     addListofWords();
 }

 public String[] getSuggestion(String word)
 {
     int i=0;
     String[] suggestions = new String[5];
     for(Map.Entry<String,String> entry : dictionary.entrySet())
     {

         int lastIndex = Math.min(word.length(),entry.getKey().length());
       if (word.compareTo(entry.getKey().substring(0, lastIndex)) == 0)
       {
           suggestions[i++] = entry.getKey();
       }

       if(i==4) break;
     }



     return suggestions;
 }
    public boolean addWord(String word, String meaning)
    {
        dictionary.put(word,meaning);
        return true;
    }

    public String findMeaning(String word){
     if(!dictionary.containsKey(word)){
         return "Given Word Not Found";
     }
     else return dictionary.get(word);
    }

    private void addListofWords(){
        addWord("Abject","Miserable");
        addWord("Abjormal","Not normal");
        addWord("Abjade","Wear away");
        addWord("Acquit","Free from a criminal charge by a verdict of not guilty");
        addWord("Callous","Insensitive");
        addWord("Cantankerous","Quarrelsome, Irascible");
        addWord("Clandestine","Kept secret or done secretively, especially because illicit.");
        addWord("Cumbersome","Heavy or large & therefore difficult to carry or use");
        addWord("Debility","Physical weakness, especially as a result of illness");
        addWord("Denunciation","public condemnation of someone or something / informing against someone");
        addWord("Dormant","Having normal physical functions suspended or slowed down for a period of time; in or as if in a deep sleep");
        addWord("Elucidate","To make clear");
        addWord("Fastidious","Careful in all details, meticulous, very difficult to please");
        addWord("Formidable","Overwhelming, alarming, dreadful");
        addWord("Forsake","To abandon");
        addWord("Fraught","causing or affected by anxiety or stress, filled with something undesirable");
        addWord("Gauche","Tactless");
        addWord("Haughty","Proud");
        addWord("Hovered","Remain in one place in the air");
        addWord("Impasse","A situation in which no progress is possible");
        addWord("Incorrigible","Not able to be changed or reformed");
        addWord("Inextricable","Cannot be taken out, irredeemable");
        addWord("Knotty","Puzzling");
        addWord("Ligature","Something that is used to bind");
        addWord("Macabre","Horrible");
        addWord("Modalities","A Specific mode in which something is expressed or is experienced something exists");
        addWord("Nullify","Make void");
        addWord("Ostensible","Apparent");
        addWord("Oust","To eject");
        addWord("Overt","In the open");
        addWord("Pacify","To calm");
        addWord("Palatial","Like a palace");
        addWord("Penance","Punishment inflicted on oneself for expressing repentance for any wrongdoing of one’s own");
        addWord("Pretence","An attempt to make something that is not the case appears true");
        addWord("Query","Question");
        addWord("Queue","Line");
        addWord("Quiet","Making no noise");
        addWord("Quintessential","Representing the most perfect or typical example of a quality or class");
        addWord("Quip","Witty remark");
        addWord("Radical","Extreme");
        addWord("Rampage","Violence");
        addWord("Rapid","Having great speed");
        addWord("Rapport","Harmony");
        addWord("Recalcitrant","Obstinately defiant of authority, difficult to manage");
        addWord("Reliant","having or showing dependence on something");
        addWord("Robust","Sturdy in construction (in case of objects); strong and rich in flavor and smell (in case of wine or food)");
        addWord("Rogue","A dishonest or unprincipled person.");
        addWord("Sanguine","Optimistic or positive, especially in an apparently bad situation");
        addWord("Startling","very surprising, astonishing or remarkable");
        addWord("Stationary","Unchanging");
        addWord("Stealth","Secret");
        addWord("Unravelled","investigated or solved and explained something complicated and difficult / undo twisted or knotted or woven threads");
        addWord("Uproarious","Noisy");
        addWord("Urbane","Courteous");
        addWord("Urgent","Required immediately");
        addWord("Wretchedness","Extreme misery or unhappiness");
        addWord("Wrought","Worked into shape by artistry or effort, fashioned, formed");
        addWord("Wry","Twisted");
        addWord("Zany","Silly, crazy");
        addWord("Zenith","Peak");
        addWord("Zombie","A frightening person");
    }
}
