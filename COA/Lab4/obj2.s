@ NAME: 
@ REDG: 
@ Obj 2 - Perform addition, subtraction & multiplication of two 32-bit numbers

.global _start
_start:
	LDR R0, =0X10100000
	LDR R1, [R0], #4
	LDR R2, [R0], #4
	ADDS R3, R1, R2
	STR R3, [R0], #4
	SUBS R4, R1, R2
	STR R4, [R0], #4
	MUL R5, R1, R2
	STR R5, [R0], #4
B .
