boolean isLucky(int n) {
    int [] sumNumberGroups = getSumNumberGroups( n );
    
    return sumNumberGroups[ 0 ] ==  sumNumberGroups[ 1 ];
}

int [] getSumNumberGroups ( int n ){
    
    /*int numberDigits = getNumberDigits( n );
    int [] firstGroup = getFirstGroup( n, numberDigits );
    int [] secondGroup = getSecondGroup( n, numberDigits );
        
    return new int []{ getSumGroup( firstGroup ), getSumGroup( secondGroup ) };*/
    
    String digits = getDigits( n );
    
    int [] firstGroup = getFirstGroup( digits );
    int [] secondGroup = getSecondGroup( digits );
        
    return new int []{ getSumGroup( firstGroup ), getSumGroup( secondGroup ) };
}

String getDigits ( int number ){
    return String.valueOf( number );
}

int [] getFirstGroup ( String digits ){
    int length = digits.length()/2;
    int [] numbers = new int [ length ];
    
    for ( int i = 0; i < length; i++ ){
        String character = String.valueOf( digits.charAt( i ) );
        numbers[ i ] = Integer.parseInt( character );
    }
    
    return numbers;
}

int [] getSecondGroup ( String digits ){
    int length = digits.length()/2;
    int [] numbers = new int [ length ];
    
    for ( int i = 0; i < length; i++ ){
        String character = String.valueOf( digits.charAt( length+i ) );
        numbers[ i ] = Integer.parseInt( character );
    }
    
    return numbers;
}

/*int getNumberDigits ( int n ){
    /*double digits = Math.log10( n );
    int digitsInteger = (int) digits;
    double digitsDouble = digitsInteger;
    
    if ( digits != digitsDouble ) digitsInteger++;* /
    //return digitsInteger;
    
    String number = String.valueOf( n );
    
    return number.legth;
}*/

/*int [] getFirstGroup ( int digits, numberDigits ){
    double power = numberDigits/2;
    double fragment = Math.pow( 10, power );
}*/


int getSumGroup ( int [] group ){
    int total = 0;
    
    for ( int element : group ){
        total += element;
    }
    
    return total;
}
