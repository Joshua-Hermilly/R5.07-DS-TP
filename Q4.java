public class Q4
{
	public static void main( String[] args )
	{
		int n = Integer.parseInt( args[0] );

		for ( int ligne = n; ligne >= 1; ligne-- )
		{
			StringBuilder texte = new StringBuilder();

			for ( int cpt = ligne; cpt >= 1; cpt-- )
			{
				texte.append( cpt ).append( ' ' );
			}

			System.out.println( texte.toString().trim() );
		}
	}
}
