public class DNALib {

    public static boolean validator(String sequence) {
        if (sequence.isEmpty() || sequence.length() % 3 != 0) {
            return false;
        }
        return validatorHelper(sequence.toUpperCase(), 0);
    }

    private static boolean validatorHelper(String sequence, int index) {
        if (index >= sequence.length()) {
            return true;
        }
        char c = sequence.charAt(index);
        if (c != 'A' && c != 'C' && c != 'G' && c != 'T') {
            return false;
        }
        return validatorHelper(sequence, index + 1);
    }
    public static String reverser(String sequence){
        if(sequence.isEmpty()){
            return "";
        }
        return sequence.charAt(sequence.length()-1) + reverser(sequence.substring(0, sequence.length()-1));
    }
    public static String inverser(String sequence){
        if(sequence.isEmpty()){
            return "";
        }
        char c = sequence.charAt(0);
        char inverse;
        switch(c){
            case 'A':
                inverse = 'T';
                break;
            case 'C':
                inverse = 'G';
                break;
            case 'G':
                inverse = 'T';
                break;
            case 'T':
                inverse = 'A';
                break;
            default:
                return "";
        }
        return inverse + inverser(sequence.substring(1));
    }
    public static String translator(String sequence){
        if(sequence.length() < 3){
            return "";
        }
        String code = sequence.substring(0,3);
        String aminoAcid = toAminoAcid(code);
        return aminoAcid + translator(sequence.substring(3));
    }
    private static String toAminoAcid(String codon) {
        String aminoacid = "";
        switch (codon) {
            case "GCA":
            case "GCC":
            case "GCG":
            case "GCT":
                aminoacid = "A";
                break;
            case "TGC":
            case "TGT":
                aminoacid = "C";
                break;
            case "GAC":
            case "GAT":
                aminoacid = "D";
                break;
            case "GAA":
            case "GAG":
                aminoacid = "E";
                break;
            case "TTC":
            case "TTT":
                aminoacid = "F";
                break;
            case "GGA":
            case "GGC":
            case "GGG":
            case "GGT":
                aminoacid = "G";
                break;
            case "CAC":
            case "CAT":
                aminoacid = "H";
                break;
            case "ATA":
            case "ATC":
            case "ATT":
                aminoacid = "I";
                break;
            case "AAA":
            case "AAG":
                aminoacid = "K";
                break;
            case "CTA":
            case "CTC":
            case "CTG":
            case "CTT":
            case "TTA":
            case "TTG":
                aminoacid = "L";
                break;
            case "ATG":
                aminoacid = "M";
                break;
            case "AAT":
            case "AAC":
                aminoacid = "N";
                break;
            case "CCA":
            case "CCC":
            case "CCG":
            case "CCT":
                aminoacid = "P";
                break;
            case "CAA":
            case "CAG":
                aminoacid = "Q";
                break;
            case "AGA":
            case "AGG":
            case "CGA":
            case "CGC":
            case "CGG":
            case "CGT":
                aminoacid = "R";
                break;
            case "AGC":
            case "AGT":
            case "TCA":
            case "TCC":
            case "TCG":
            case "TCT":
                aminoacid = "S";
                break;
            case "ACA":
            case "ACC":
            case "ACG":
            case "ACT":
                aminoacid = "T";
                break;
            case "GTA":
            case "GTC":
            case "GTG":
            case "GTT":
                aminoacid = "V";
                break;
            case "TGG":
                aminoacid = "W";
                break;
            case "TAC":
            case "TAT":
                aminoacid = "Y";
                break;
            case "TAA":
            case "TAG":
            case "TGA":
                aminoacid = "-";
                break;

        }
        return aminoacid;
    }
}
