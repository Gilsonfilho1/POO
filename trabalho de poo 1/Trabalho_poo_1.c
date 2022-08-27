#include <stdio.h>
int main()
{

    int i;
    int vetD[30];
    int vetE[30];
    int n;
    int tam;
    char pe;
    int count = 0;

    for (i = 0; i < 30; i++)
    {
        vetD[i] = 0;
        vetE[i] = 0;
    }

    printf("Digite a quantidade de botas individuais: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        printf("Digite o tamanho da bota e o lado do pe:");
        scanf("%d %c", &tam, &pe);
        if (pe == 'D')
        {
            vetD[tam - 30]++;
        }
        else
        {
            vetE[tam - 30]++;
        }
    }

    for (i = 0; i < 30; i++)
    {
        if (vetD[i] < vetE[i]){
            count += vetD[i];
            }else{
            count += vetE[i];
            }
    }
    printf("%d\n", count);
    return 0;
}