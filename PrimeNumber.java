/*
Aim:Write a program to generate prime numbers between 100 to 500.
*/

class PrimeNumber
{
	public static void main(String args[])
	{
		boolean flag;
		System.out.println("Prime numbers between 100 to 500");
		for(int n=100;n<=500;n++)
		{
			flag=true;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
				flag=false;
				break;
				}
			}
			if(flag==true)
			System.out.println(n);
		}
	}
}

/*Output:
Prime numbers between 100 to 500
101
103
107
109
113
127
131
137
139
149
151
157
163
167
173
179
181
191
193
197
199
211
223
227
229
233
239
241
251
257
263
269
271
277
281
283
293
307
311
313
317
331
337
347
349
353
359
367
373
379
383
389
397
401
409
419
421
431
433
439
443
449
457
461
463
467
479
487
491
499
*/
