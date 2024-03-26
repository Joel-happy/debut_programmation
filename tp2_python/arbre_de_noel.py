
def arbre():
    try:
        hauteur_arbre=int(("Entrez la hauteur que vous désirez pour l'arbre?"))
    except ValueError:
        print("Vous avez entré une mauvaise valeur")              #partie supérieure
    for i in range(1,hauteur_arbre+1):
        for j in range(1,hauteur_arbre-i+1):
            print(" ",end=" ")
        for j in range (1,2*i-1+1):
            print("*",end=" ")
        print()
    for i in range(0,1,i+1):                            #partie inférieure
        for j in range(0,hauteur_arbre+0,j+1):
            print("*\n",end="")
            print("***")
        for j in range(0,hauteur_arbre+0,j+1):
            print("=",end="")

arbre()
    # x = np.arange(7, 16)
    # y = np.arange(1, 18, 2)
    # z = np.column_stack((x[::-1], y))

    # for i, j in z:
    #     print(' '*i+'*'*j)
    # for r in range(3):
    #     print(' '*13, '||')
    # print(' '*12, end='\====/')
    # print('')
    # hauteur=int
    # i=int(0) 
    # hauteur=input("Entrez la hauteur de l'arbre")
    # while i<hauteur:
    #     print("=")



