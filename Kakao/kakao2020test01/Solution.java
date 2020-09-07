
public class Solution {
	public static void main(String[] args) {
		String inputData= "aabbaccc";
		String preData= null;
		String zipData= null;
		int startIndex= 0;
		int endIndex= 0;
		int zipCounter= 1;
		
		for(int i= 1; i<= (inputData.length()/ 2); i++) {
			for(int j= 0; j< inputData.length(); j++) {
				endIndex+= i;
				
				if(endIndex> inputData.length()) {
					inputData.substring(startIndex, inputData.length());
					break;
				}	//end of if
				
				if(inputData.substring(startIndex, endIndex).equals(preData)) {
					zipCounter++;
				}	//end of if
				else {
					zipCounter= 1;
				}	//end of else
				
				preData= inputData.substring(startIndex, endIndex);
				startIndex+= i;
			}	//end of for
			
			System.out.printf("\n=======================\n");
			preData= null;
			startIndex= 0;
			endIndex= 0;
		}	//end of for
	}	//end of main
}
