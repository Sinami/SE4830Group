from django.shortcuts import render, redirect, get_object_or_404
from django.http import HttpResponse

import logging
logger = logging.getLogger(__name__)

def index(request):
	return HttpResponse('Boo!')