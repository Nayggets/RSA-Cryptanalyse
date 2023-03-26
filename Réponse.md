# Question 1 : 
> Pourquoi pourrait-on vouloir utiliser un exposant secret petit ?

L'utilisation d'un exposant secret petit peut être intéressant pour des raisons de temps et de facilité d'envoi. En effet, lorsque les calculs impliquent de très grands nombres, l'utilisation d'un exposant secret de petite taille peut considérablement réduire le temps nécessaire pour effectuer les calculs. De plus, si l'objectif est de transmettre des données cryptées de manière efficace, l'utilisation d'un exposant secret plus petit peut faciliter la transmission des clés cryptographiques nécessaires entre les parties impliquées. Toutefois, il est important de noter que l'utilisation d'un exposant secret de petite taille peut également rendre les systèmes de cryptographie plus vulnérables aux attaques.

# Question 2 : 
> En déduire alors à quelle condition 'd' peut être retrouvée en utilisant le développement en fractions continues d’un certain rationnel.

Pour retrouver la valeur de 'd' en utilisant le développement en fractions continues d'un certain rationnel, nous pouvons utiliser une technique appelée la méthode de factorisation de Wiener. Cette méthode repose sur le fait que, si le modulo 'N' est suffisamment grand et que l'exposant 'd' est choisi de manière imprudente (c'est-à-dire s'il est trop petit par rapport à la taille de 'N'), alors 'd' peut être retrouvé à l'aide de la fraction continue de 'E/N'. En utilisant cette fraction continue, nous pouvons calculer tous les 'di' à l'aide d'une fonction récurrente, et ensuite tester chaque 'di' à l'aide d'une fonction d'encryption-decryption. Si l'une des valeurs de 'di' testées est correct à partir de la clé public, cela signifie que nous avons trouvé la valeur de 'd' correcte. 
Cette méthode est vulnérable aux attaques par force brute, elle peut être évidemment contournée en choisissant un exposant secret suffisamment grand et en utilisant une taille de clé adéquate.

# Question 4 : 
> Quelle est la taille en bits de 'd'?

La taille de 'd' est de 500 bits. 
