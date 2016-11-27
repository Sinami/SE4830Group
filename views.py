from django.shortcuts import render, redirect, get_object_or_404
from django.contrib.auth.decorators import login_required
from django.http import HttpResponse

import logging
logger = logging.getLogger(__name__)

def index(request):
	return render(request, 'hyperGo/pages/index.html')

def registration(request):
	return render(request, 'hyperGo/pages/registration.html')

def contact(request):
	return render(request, 'hyperGo/pages/contact.html')

@login_required
def management(request):
	return render(request, 'hyperGo/pages/management.html')

#@login_required
def reservation(request):
	return render(request, 'hyperGo/pages/reservation.html')