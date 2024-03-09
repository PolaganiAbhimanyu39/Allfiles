import datetime
from django.shortcuts import render

# Create your views here.
def home(request):
    now = datetime.datetime.now()
    return render(request,"htmlfiles/home.html",{
        "val":now.month == 1 and now.day == 1,
    })