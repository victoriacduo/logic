def ageCalculator(y, m, d):
    import datetime
    today = datetime.datetime.today().date()
    dob = datetime.date(y, m, d)
    age = int((today-dob).days / 365.25)
    print(age)

ageCalculator(2002, 11, 6)