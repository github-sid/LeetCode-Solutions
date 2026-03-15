class Solution {
    public boolean isValidSudoku(char[][] b) {
        HashSet<String> set = new HashSet<String>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                //Check if it's . or not
                if(b[i][j] != '.')
                {
                    //Adding in HashSet gives us true or false;
                    if( !set.add(b[i][j] + "is at row" + i ) || 
                        !set.add(b[i][j] + "is at col" + j ) || 
                        !set.add(b[i][j] + "is at box" + i/3 + j/3 ))
                        {
                            //If it returns false;
                            return false;
                        }
                }
                
            }
        }

        return true;

        
        
        
        
    }
}