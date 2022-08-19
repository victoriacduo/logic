from countryinfo import CountryInfo

count = input("Digite o país: ")
country = CountryInfo(count)

print("Capital: ", country.capital())
print("Nota: ", country.currencies())
print("Idioma: ", country.languages())
print("Fronteiras: ", country.borders())
print("Outros nomes: ", country.alt_spellings())